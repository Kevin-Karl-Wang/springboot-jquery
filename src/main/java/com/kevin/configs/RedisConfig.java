package com.kevin.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by kevin on 2017/6/4.
 * <p>
 * Redis配置
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisRepository redisRepository(RedisTemplate<String, String> redisTemplate) {
        return new RedisRepository(redisTemplate);
    }

}
