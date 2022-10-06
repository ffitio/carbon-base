package io.ffit.carbon.response;

import io.ffit.carbon.dto.DTO;

/**
 * Response
 *
 * @author Lay
 * @date 2022/9/27
 */
public abstract class Response extends DTO {
    private static final long serialVersionUID = 1L;

    /**
     * successful
     */
    private boolean success;

    /**
     * error code
     */
    private String errCode;

    /**
     * error message
     */
    private String errMessage;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    @Override
    public String toString() {
        return "Response [success=" + success + ", errCode=" + errCode + ", errMessage=" + errMessage + "]";
    }
}
