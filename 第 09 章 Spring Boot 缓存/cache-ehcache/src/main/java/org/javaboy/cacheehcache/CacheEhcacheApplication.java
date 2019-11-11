package org.javaboy.cacheehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheEhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheEhcacheApplication.class, args);
    }

}
