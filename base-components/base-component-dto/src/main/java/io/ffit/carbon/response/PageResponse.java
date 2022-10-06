package io.ffit.carbon.response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Pagination Response
 *
 * @author Lay
 * @date 2022/9/27
 */
public class PageResponse<T> extends Response {
    private static final long serialVersionUID = 1L;

    /**
     * response data
     */
    private Collection<T> data;

    /**
     * total records
     */
    private int total;

    /**
     * records per page
     */
    private int pageSize;

    /**
     * current page
     */
    private int pageIndex;

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
        this.data = null == data ? Collections.emptyList() : data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return Math.max(pageSize, 1);
    }

    public void setPageSize(int pageSize) {
        this.pageSize = Math.max(pageSize, 1);
    }

    public int getPageIndex() {
        return Math.max(pageIndex, 1);
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = Math.max(pageIndex, 1);
    }

    public int getPageCount() {
        return this.total % this.pageSize == 0 ? this.total / this.pageSize : (this.total / this.pageSize) + 1;
    }

    public boolean isEmpty() {
        return null == data || data.isEmpty();
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public static <T> PageResponse<T> success() {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static <T> PageResponse<T> error(String code, String message) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(false);
        response.setErrCode(code);
        response.setErrMessage(message);
        return response;
    }

    public static <T> PageResponse<T> error(ResponseError error) {
        return error(error.getCode(), error.getMessage());
    }

    public static <T> PageResponse<T> of(Collection<T> data, int total, int pageSize, int pageIndex) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setData(data);
        response.setTotal(total);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);
        return response;
    }

    public static <T> PageResponse<T> of(int pageSize, int pageIndex) {
        return of(Collections.emptyList(), 0, pageSize, pageIndex);
    }
}
