package io.ffit.carbon.dto;

/**
 * Page query params from request
 *
 * @author Lay
 * @date 2022/9/27
 */
public abstract class PageQuery extends Query {
    private static final long serialVersionUID = 1L;

    private static final int DEFAULT_PAGE_SIZE = 10;

    private int pageSize = DEFAULT_PAGE_SIZE;

    private int pageIndex = 1;

    private boolean needTotal = true;

    public int getPageIndex() {
        return Math.max(pageIndex, 1);
    }

    public PageQuery setPageIndex(int pageIndex) {
        this.pageIndex = Math.max(pageIndex, 1);
        return this;
    }

    public int getPageSize() {
        if (pageSize < 1) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    public PageQuery setPageSize(int pageSize) {
        if (pageSize < 1) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        this.pageSize = pageSize;
        return this;
    }

    public int getOffset() {
        return (getPageIndex() - 1) * getPageSize();
    }

    public boolean isNeedTotal() {
        return needTotal;
    }

    public void setNeedTotal(boolean needTotal) {
        this.needTotal = needTotal;
    }
}
