package io.ffit.carbon.context.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Client System
 *
 * @author Lay
 * @date 2022/10/12
 */
@Getter
@AllArgsConstructor
public enum ClientSystem {
    Windows(1),
    Apple(2),
    Linux(3),
    IOS(4),
    Android(5),
    Web(6),
    MiniProgram(7),
    ;

    private final int system;

    public static ClientSystem of(int system) {
        for (ClientSystem value : values()) {
            if (value.system == system) {
                return value;
            }
        }
        return null;
    }
}
