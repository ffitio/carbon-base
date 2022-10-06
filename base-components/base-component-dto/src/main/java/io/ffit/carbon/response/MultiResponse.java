package io.ffit.carbon.response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Response with batch objects to return
 *
 * @author Lay
 * @date 2022/9/27
 */
public class MultiResponse<T> extends Response {
    private static final long serialVersionUID = 1L;

    /**
     * response data
     */
    private Collection<T> data;

    public List<T> getData() {
        if (null == data) {
            return Collections.emptyList();
        }

        if (data instanceof List) {
            return (List<T>) data;
        }

        return new ArrayList<>(data);
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }

    public boolean isEmpty() {
        return data == null || data.isEmpty();
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public static <T> MultiResponse<T> success() {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static <T> MultiResponse<T> error(String code, String message) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(false);
        response.setErrCode(code);
        response.setErrMessage(message);
        return response;
    }

    public static <T> MultiResponse<T> error(ResponseError error) {
        return error(error.getCode(), error.getMessage());
    }

    public static <T> MultiResponse<T> of(Collection<T> data) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }
}
