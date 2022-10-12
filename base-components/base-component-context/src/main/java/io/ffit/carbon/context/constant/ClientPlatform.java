package io.ffit.carbon.context.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Client Platform
 *
 * @author Lay
 * @date 2022/10/12
 */
@Getter
@AllArgsConstructor
public enum ClientPlatform {
    Desktop(100),
    Pad(200),
    Phone(300),
    Television(400),
    Watch(500),
    ;

    private final int platform;

    public static ClientPlatform of(int platform) {
        for (ClientPlatform value : values()) {
            if (value.platform == platform) {
                return value;
            }
        }
        return null;
    }
}
