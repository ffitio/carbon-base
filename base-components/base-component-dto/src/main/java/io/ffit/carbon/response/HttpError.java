package io.ffit.carbon.response;

/**
 * Http Errors Response
 *
 * @author Lay
 * @date 2022/9/29
 */
public enum HttpError implements ResponseError {
    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/400">Bad Request</a>
     * <p>The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).</p>
     */
    BadRequest("400", "Bad Request"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/401">Unauthorized</a>
     * <p>Although the HTTP standard specifies "unauthorized", semantically this response means "unauthenticated". That is, the client must authenticate itself to get the requested response.</p>
     */
    Unauthorized("401", "Unauthorized"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/403">Forbidden</a>
     * <p>The client does not have access rights to the content; that is, it is unauthorized, so the server is refusing to give the requested resource. Unlike 401 Unauthorized, the client's identity is known to the server.</p>
     */
    Forbidden("403", "Forbidden"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/404">Not Found</a>
     * <p>The server can not find the requested resource. In the browser, this means the URL is not recognized. In an API, this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this response instead of 403 Forbidden to hide the existence of a resource from an unauthorized client. This response code is probably the most well known due to its frequent occurrence on the web.</p>
     */
    NotFound("404", "Not Found"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/405">Method Not Allowed</a>
     * <p>The request method is known by the server but is not supported by the target resource. For example, an API may not allow calling DELETE to remove a resource.</p>
     */
    MethodNotAllowed("405", "Method Not Allowed"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/406">Not Acceptable</a>
     * <p>This response is sent when the web server, after performing <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Content_negotiation#server-driven_negotiation">server-driven content negotiation</a>, doesn't find any content that conforms to the criteria given by the user agent.</p>
     */
    NotAcceptable("406", "Not Acceptable"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/407">Proxy Authentication Required</a>
     * <p>This is similar to 401 Unauthorized but authentication is needed to be done by a proxy.</p>
     */
    ProxyAuthenticationRequired("407", "Proxy Authentication Required"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408">Request Timeout</a>
     * <p>This response is sent on an idle connection by some servers, even without any previous request by the client. It means that the server would like to shut down this unused connection. This response is used much more since some browsers, like Chrome, Firefox 27+, or IE9, use HTTP pre-connection mechanisms to speed up surfing. Also note that some servers merely shut down the connection without sending this message.</p>
     */
    RequestTimeout("408", "Request Timeout"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/409">Conflict</a>
     * <p>This response is sent when a request conflicts with the current state of the server.</p>
     */
    Conflict("409", "Conflict"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/410">Gone</a>
     * <p>This response is sent when the requested content has been permanently deleted from server, with no forwarding address. Clients are expected to remove their caches and links to the resource. The HTTP specification intends this status code to be used for "limited-time, promotional services". APIs should not feel compelled to indicate resources that have been deleted with this status code.</p>
     */
    Gone("410", "Gone"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/411">Length Required</a>
     * <p>Server rejected the request because the Content-Length header field is not defined and the server requires it.</p>
     */
    LengthRequired("411", "Length Required"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/412">Precondition Failed</a>
     * <p>The client has indicated preconditions in its headers which the server does not meet.</p>
     */
    PreconditionFailed("412", "Precondition Failed"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/413">Payload Too Large</a>
     * <p>Request entity is larger than limits defined by server. The server might close the connection or return an Retry-After header field.</p>
     */
    PayloadTooLarge("413", "Payload Too Large"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/414">URI Too Long</a>
     * <p>The URI requested by the client is longer than the server is willing to interpret.</p>
     */
    URITooLong("414", "URI Too Long"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/415">Unsupported Media Type</a>
     * <p>The media format of the requested data is not supported by the server, so the server is rejecting the request.</p>
     */
    UnsupportedMediaType("415", "Unsupported Media Type"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/416">Range Not Satisfiable</a>
     * <p>The range specified by the Range header field in the request cannot be fulfilled. It's possible that the range is outside the size of the target URI's data.</p>
     */
    RangeNotSatisfiable("416", "Range Not Satisfiable"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/417">Expectation Failed</a>
     * <p>This response code means the expectation indicated by the Expect request header field cannot be met by the server.</p>
     */
    ExpectationFailed("417", "Expectation Failed"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/426">Upgrade Required</a>
     * <p>The server refuses to perform the request using the current protocol but might be willing to do so after the client upgrades to a different protocol. The server sends an Upgrade header in a 426 response to indicate the required protocol(s).</p>
     */
    UpgradeRequired("426", "Upgrade Required"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/428">Precondition Required</a>
     * <p>The origin server requires the request to be conditional. This response is intended to prevent the 'lost update' problem, where a client GETs a resource's state, modifies it and PUTs it back to the server, when meanwhile a third party has modified the state on the server, leading to a conflict.</p>
     */
    PreconditionRequired("428", "Precondition Required"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429">Too Many Requests</a>
     * <p>The user has sent too many requests in a given amount of time ("rate limiting").</p>
     */
    TooManyRequests("429", "Too Many Requests"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/431">Request Header Fields Too Large</a>
     * <p>The server is unwilling to process the request because its header fields are too large. The request may be resubmitted after reducing the size of the request header fields.</p>
     */
    RequestHeaderFieldsTooLarge("431", "Request Header Fields Too Large"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/451">Unavailable For Legal Reasons</a>
     * <p>The user agent requested a resource that cannot legally be provided, such as a web page censored by a government.</p>
     */
    UnavailableForLegalReasons("451", "Unavailable For Legal Reasons"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500">Internal Server Error</a>
     * <p>The server has encountered a situation it does not know how to handle.</p>
     */
    InternalServerError("500", "Internal Server Error"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/501">Not Implemented</a>
     * <p>The request method is not supported by the server and cannot be handled. The only methods that servers are required to support (and therefore that must not return this code) are GET and HEAD.</p>
     */
    NotImplemented("501", "Not Implemented"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/502">Bad Gateway</a>
     * <p>This error response means that the server, while working as a gateway to get a response needed to handle the request, got an invalid response.</p>
     */
    BadGateway("502", "Bad Gateway"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/503">Service Unavailable</a>
     * <p>The server is not ready to handle the request. Common causes are a server that is down for maintenance or that is overloaded. Note that together with this response, a user-friendly page explaining the problem should be sent. This response should be used for temporary conditions and the Retry-After HTTP header should, if possible, contain the estimated time before the recovery of the service. The webmaster must also take care about the caching-related headers that are sent along with this response, as these temporary condition responses should usually not be cached.</p>
     */
    ServiceUnavailable("503", "Service Unavailable"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/504">Gateway Timeout</a>
     * <p>This error response is given when the server is acting as a gateway and cannot get a response in time.</p>
     */
    GatewayTimeout("504", "Gateway Timeout"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/505">HTTP Version Not Supported</a>
     * <p>The HTTP version used in the request is not supported by the server.</p>
     */
    HTTPVersionNotSupported("505", "HTTP Version Not Supported"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/506">Variant Also Negotiates</a>
     * <p>The server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.</p>
     */
    VariantAlsoNegotiates("506", "Variant Also Negotiates"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/510">Not Extended</a>
     * <p>Further extensions to the request are required for the server to fulfill it.</p>
     */
    NotExtended("510", "Not Extended"),

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/511">Network Authentication Required</a>
     * <p>Indicates that the client needs to authenticate to gain network access.</p>
     */
    NetworkAuthenticationRequired("511", "Network Authentication Required"),
    ;

    private final String code;
    private final String message;

    HttpError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static HttpError of(int httpStatusCode) {
        for (HttpError value : values()) {
            if (value.code.equals(String.valueOf(httpStatusCode))) {
                return value;
            }
        }
        return null;
    }
}
