package io.ffit.carbon.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Client Object
 *
 * @author Lay
 * @date 2022/9/28
 */
public abstract class ClientObject implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Map<String, Object> extra = null;

    public void putExtraValue(String key, Object value) {
        if (extra == null) {
            extra = new HashMap<>();
        }

        extra.put(key, value);
    }

    public void putExtra(Map<String, Object> map) {
        if (extra == null) {
            extra = map;
        } else {
            extra.putAll(map);
        }
    }

    public Object getExtraValue(String key) {
        if (extra == null) {
            return null;
        }

        return extra.get(key);
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }
}
