package io.ffit.carbon.response;

/**
 * Simple Response
 *
 * @author Lay
 * @date 2022/9/28
 */
public class SimpleResponse extends Response {
    public static SimpleResponse success() {
        SimpleResponse response = new SimpleResponse();
        response.setSuccess(true);
        return response;
    }

    public static SimpleResponse error(String code, String message) {
        SimpleResponse response = new SimpleResponse();
        response.setErrCode(code);
        response.setErrMessage(message);
        return response;
    }

    public static SimpleResponse error(ResponseError error) {
        return error(error.getCode(), error.getMessage());
    }
}
