package io.ffit.carbon.context.handler;

import io.ffit.carbon.context.CarbonContextFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handle Request
 *
 * @author Lay
 * @date 2022/10/12
 */
public class CarbonContextInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // create context
        CarbonContextFactory.buildContext(request);

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
