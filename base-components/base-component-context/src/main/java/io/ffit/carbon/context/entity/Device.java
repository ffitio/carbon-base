package io.ffit.carbon.context.entity;

import lombok.Data;

/**
 * Device
 *
 * @author Lay
 * @date 2022/10/12
 */
@Data
public class Device {
    public static final String ID = "X-Device-Id";
    public static final String INFO = "X-Device-Info";

    /**
     * device identity
     */
    private String id;

    /**
     * device info
     */
    private String info;
}
