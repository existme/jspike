package com.existme.spike.Feign;

import feign.*;
import feign.codec.*;
import feign.gson.*;
import org.springframework.cloud.netflix.feign.support.*;
import org.springframework.context.annotation.*;

@Configuration
public class FeignConfig {

    @Bean
    public Contract feignContract() {
        return new SpringMvcContract();
    }

    @Bean
    public Decoder feignDecoder() {
        return new GsonDecoder();
    }

    @Bean
    public Encoder feignEncoder() {
        return new GsonEncoder();
    }

    //    @Bean
    //    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    //        return new BasicAuthRequestInterceptor("user", "password");
    //    }

}
