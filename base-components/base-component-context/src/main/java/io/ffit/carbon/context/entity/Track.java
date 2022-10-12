package io.ffit.carbon.context.entity;

import lombok.Data;

/**
 * Request
 *
 * @author Lay
 * @date 2022/10/12
 */
@Data
public class Track {
    public static final String REQUEST_ID = "X-Track-RequestId";
    public static final String TRANCE_ID = "X-Track-TraceId";

    /**
     * request identity
     */
    private String requestId;

    /**
     * trace identity
     */
    private String traceId;
}
