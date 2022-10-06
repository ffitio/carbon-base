package io.ffit.carbon.exception;

/**
 * System Exception
 *
 * @author Lay
 * @date 2022/9/30
 */
public class SysException extends BaseException {
    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_ERR_CODE = "error.sys";

    public SysException(String errMessage) {
        super(DEFAULT_ERR_CODE, errMessage);
    }

    public SysException(String errCode, String errMessage) {
        super(errCode, errMessage);
    }

    public SysException(String errMessage, Throwable e) {
        super(DEFAULT_ERR_CODE, errMessage, e);
    }

    public SysException(String errorCode, String errMessage, Throwable e) {
        super(errorCode, errMessage, e);
    }
}
