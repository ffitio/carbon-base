package io.ffit.carbon.context;

import org.springframework.core.NamedThreadLocal;

/**
 * Context Holder
 *
 * @author Lay
 * @date 2022/10/12
 */
public class CarbonContextHolder {
    private static final ThreadLocal<CarbonContext> carbonContext = new NamedThreadLocal<>("CarbonContext");

    public static void setContext(CarbonContext context) {
        carbonContext.set(context);
    }

    public static CarbonContext getContext() {
        return carbonContext.get();
    }
}
