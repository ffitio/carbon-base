package io.ffit.carbon.context.entity;

import io.ffit.carbon.context.constant.ClientType;
import lombok.Data;

/**
 * Client
 *
 * @author Lay
 * @date 2022/10/12
 */
@Data
public class Client {
    public static final String TYPE = "X-Client-Type";
    public static final String IP = "X-Client-IP";
    public static final String CHANNEL_ID = "X-Client-ChannelId";

    /**
     * type
     */
    private ClientType type;

    /**
     * ip address
     */
    private String ip;

    /**
     * channel identity
     */
    private String channelId;
}
