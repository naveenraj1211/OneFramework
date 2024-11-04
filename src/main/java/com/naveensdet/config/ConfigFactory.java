package com.naveensdet.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {

    public static FrameworkConfig getConfig()
    {
        // FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
