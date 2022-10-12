package io.ffit.carbon.context;

import io.ffit.carbon.context.entity.*;
import lombok.Data;

/**
 * Context
 *
 * @author Lay
 * @date 2022/10/12
 */
@Data
public class CarbonContext {

    /**
     * track
     */
    private Track track;

    /**
     * application
     */
    private Application app;

    /**
     * client
     */
    private Client client;

    /**
     * device
     */
    private Device device;

    /**
     * security
     */
    private Security security;
}
