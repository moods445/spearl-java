package com.modds;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CoreApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CoreApplication.class)
                .run(args);
    }
}
