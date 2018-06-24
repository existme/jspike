package com.existme.spike.Feign.Oidc;

import feign.*;
import feign.auth.*;
import org.springframework.cloud.netflix.feign.support.*;
import org.springframework.context.annotation.*;

@Configuration
public class OidcConfiguration {
    @Bean
    public Contract feignContract() {
        return new SpringMvcContract();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }
}
