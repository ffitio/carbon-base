package io.ffit.carbon.context.entity;

import io.ffit.carbon.context.constant.TokenFlag;
import lombok.Data;

/**
 * Security
 *
 * @author Lay
 * @date 2022/10/12
 */
@Data
public class Security {
    public static final String TOKEN = "X-Security-Token";
    public static final String TOKEN_FLAG = "X-Security-TokenFlag";
    public static final String FINGER_PRINT = "X-Security-FingerPrint";
    public static final String USER_ID = "X-Security-UserId";

    /**
     * token
     */
    private String token;

    /**
     * token flag
     */
    private TokenFlag tokenFlag;

    /**
     * finger print
     */
    private String fingerPrint;

    /**
     * user identity
     */
    private Long userId;
}
