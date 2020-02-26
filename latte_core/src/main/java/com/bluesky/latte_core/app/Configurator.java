package com.bluesky.latte_core.app;

import java.util.WeakHashMap;

/**
 * @author BlueSky
 * @date 2020/2/26
 * Description:
 */
public class Configurator {
    private static final WeakHashMap<String, Object> LATTE_CONFIGS = new WeakHashMap<>();

    private Configurator() {
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }
}
