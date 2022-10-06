package io.ffit.carbon.response;

/**
 * Response with single object to return
 *
 * @author Lay
 * @date 2022/9/27
 */
public class SingleResponse<T> extends Response {
    private static final long serialVersionUID = 1L;

    /**
     * response data
     */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> SingleResponse<T> success() {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static <T> SingleResponse<T> error(String code, String message) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(false);
        response.setErrCode(code);
        response.setErrMessage(message);
        return response;
    }

    public static <T> SingleResponse<T> error(ResponseError error) {
        return error(error.getCode(), error.getMessage());
    }

    public static <T> SingleResponse<T> of (T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }
}
