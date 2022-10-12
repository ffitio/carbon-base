package io.ffit.carbon.context.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Token Flag
 *
 * @author Lay
 * @date 2022/10/12
 */
@Getter
@AllArgsConstructor
public enum TokenFlag {
    Newcomer(0),
    Ordinary(1),
    Closed(-1),
    ;
    private final int flag;

    public static TokenFlag of(Integer flag) {
        if (flag != null && flag > 0) {
            for (TokenFlag value : values()) {
                if (value.flag == flag) {
                    return value;
                }
            }
        }
        return null;
    }
}
