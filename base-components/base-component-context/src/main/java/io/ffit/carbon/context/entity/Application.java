package io.ffit.carbon.context.entity;

import lombok.Data;

/**
 * Application
 *
 * @author Lay
 * @date 2022/10/12
 */
@Data
public class Application {
    public static final String ID = "X-App-Id";
    public static final String VERSION = "X-App-Version";
    public static final String VERSION_NUM = "X-App-VersionNum";

    /**
     * identity
     */
    private String id;

    /**
     * version
     */
    private String version;

    /**
     * version number
     */
    private Long versionNum;
}
