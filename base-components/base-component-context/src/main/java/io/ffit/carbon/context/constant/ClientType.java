package io.ffit.carbon.context.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Client Type
 *
 * @author Lay
 * @date 2022/10/12
 */
@AllArgsConstructor
@Getter
public enum ClientType {
    /**
     * Windows Desktop
     */
    DesktopWindows(ClientPlatform.Desktop, ClientSystem.Windows),

    /**
     * Mac Desktop
     */
    DesktopApple(ClientPlatform.Desktop, ClientSystem.Apple),

    /**
     * Linux Desktop
     */
    DesktopLinux(ClientPlatform.Desktop, ClientSystem.Linux),

    /**
     * Windows Pad
     */
    PadWindows(ClientPlatform.Pad, ClientSystem.Windows),

    /**
     * Linux Pad
     */
    PadLinux(ClientPlatform.Pad, ClientSystem.Linux),

    /**
     * Android Pad
     */
    PadAndroid(ClientPlatform.Pad, ClientSystem.Android),

    /**
     * iPad
     */
    PadApple(ClientPlatform.Pad, ClientSystem.Apple),

    /**
     * Android Phone
     */
    PhoneAndroid(ClientPlatform.Phone, ClientSystem.Android),

    /**
     * iPhone
     */
    PhoneApple(ClientPlatform.Phone, ClientSystem.IOS),

    /**
     * Android TV
     */
    TVAndroid(ClientPlatform.Television, ClientSystem.Android),

    /**
     * Apple TV
     */
    TVApple(ClientPlatform.Television, ClientSystem.Apple),

    /**
     * Android Watch
     */
    WatchAndroid(ClientPlatform.Watch, ClientSystem.Android),

    /**
     * iWatch
     */
    WatchApple(ClientPlatform.Watch, ClientSystem.Apple),

    /**
     * PC Web
     */
    DesktopWeb(ClientPlatform.Desktop, ClientSystem.Web),

    /**
     * PC MiniProgram
     */
    DesktopMiniProgram(ClientPlatform.Desktop, ClientSystem.MiniProgram),

    /**
     * H5
     */
    PhoneWeb(ClientPlatform.Phone, ClientSystem.Web),

    /**
     * Mobile MiniProgram
     */
    PhoneMiniProgram(ClientPlatform.Phone, ClientSystem.MiniProgram),

    UNKNOWN(-1),
    ;
    private final int type;
    ClientType(ClientPlatform platform, ClientSystem system) {
        this(platform.getPlatform() + system.getSystem());
    }

    public ClientSystem getSystem() {
        if (type > 0) {
            int s = type % 100;
            return ClientSystem.of(s);
        }
        return null;
    }

    public ClientPlatform getPlatform() {
        ClientSystem system = getSystem();
        if (system != null) {
            return ClientPlatform.of(type - system.getSystem());
        }
        return null;
    }

    public static ClientType of(Integer type) {
        if (type != null && type > 0) {
            for (ClientType value : values()) {
                if (value.type == type) {
                    return value;
                }
            }
        }

        return UNKNOWN;
    }
}
