package com.demo.feign.config;

import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HttpMessageConvertersAutoConfiguration.class, FeignAutoConfiguration.class})
@EnableFeignClients(basePackages = "com.demo.feign.client")
public class Config {

}
