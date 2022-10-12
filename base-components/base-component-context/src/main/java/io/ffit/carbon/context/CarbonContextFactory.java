package io.ffit.carbon.context;

import io.ffit.carbon.context.constant.ClientType;
import io.ffit.carbon.context.constant.TokenFlag;
import io.ffit.carbon.context.entity.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Context Factory
 *
 * @author Lay
 * @date 2022/10/12
 */
public class CarbonContextFactory {

    public static void buildContext(HttpServletRequest request) {
        // application
        Application app = buildApplication(request);
        // client
        Client client = buildClient(request);
        // device
        Device device = buildDevice(request);
        // track
        Track track = buildTrack(request);
        // security
        Security security = buildSecurity(request);

        // create context
        CarbonContext context = new CarbonContext();
        context.setApp(app);
        context.setClient(client);
        context.setDevice(device);
        context.setTrack(track);
        context.setSecurity(security);
        CarbonContextHolder.setContext(context);
    }

    private static Application buildApplication(HttpServletRequest request) {
        Application app = new Application();
        app.setId(request.getHeader(Application.ID));
        app.setVersion(request.getHeader(Application.VERSION));
        app.setVersionNum(parseLong(request.getHeader(Application.VERSION_NUM)));
        return app;
    }

    private static Client buildClient(HttpServletRequest request) {
        Client client = new Client();
        client.setType(ClientType.of(parseInt(request.getHeader(Client.TYPE))));
        client.setIp(request.getHeader(Client.IP));
        client.setChannelId(request.getHeader(Client.CHANNEL_ID));
        return client;
    }

    private static Device buildDevice(HttpServletRequest request) {
        Device device = new Device();
        device.setId(request.getHeader(Device.ID));
        device.setInfo(request.getHeader(Device.INFO));
        return device;
    }

    private static Track buildTrack(HttpServletRequest request) {
        Track track = new Track();
        track.setRequestId(request.getHeader(Track.REQUEST_ID));
        track.setTraceId(request.getHeader(Track.TRANCE_ID));
        return track;
    }

    private static Security buildSecurity(HttpServletRequest request) {
        Security security = new Security();
        security.setToken(request.getHeader(Security.TOKEN));
        security.setTokenFlag(TokenFlag.of(parseInt(request.getHeader(Security.TOKEN_FLAG))));
        security.setFingerPrint(request.getHeader(Security.FINGER_PRINT));
        security.setUserId(parseLong(request.getHeader(Security.USER_ID)));
        return security;
    }

    private static Integer parseInt(String s) {
        if (s == null) {
            return null;
        }

        try {
            return Integer.parseInt(s);
        } catch (Exception ignored) {
            return null;
        }
    }

    private static Long parseLong(String s) {
        if (s == null) {
            return null;
        }

        try {
            return Long.parseLong(s);
        } catch (Exception ignored) {
            return null;
        }
    }
}
