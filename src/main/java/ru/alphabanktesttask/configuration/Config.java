package ru.alphabanktesttask.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class Config {
    @Bean
    public CacheManager cacheManager() {
        return new CaffeineCacheManager("yesterdayrates");
    }
}
