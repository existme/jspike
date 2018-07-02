package com.existme.spike.Feign.Oidc;

import org.springframework.cloud.netflix.feign.*;
import org.springframework.web.bind.annotation.*;

//@FeignClient(value = "oidcClient", configuration = OidcConfiguration.class)
@FeignClient(value = "oidcClient", url="${feign.client.config.oidc.root}")
public interface OidcClient {

    @RequestMapping(path = "/.well-known/openid-configuration", method = RequestMethod.GET)
    WellknownEntity getWellkownResponse();

    @RequestMapping(path = "/authorize?client_id={clientId}&redirect_uri={redirectUri}&scope={scope}&response_type=code&state={state}",
            method = RequestMethod.GET)
    String authorize(
            @PathVariable(value = "clientId") String clientId,
            @PathVariable(value = "redirectUri") String redirectUri,
            @PathVariable(value = "scope") String scope,
            @PathVariable(value = "state") String state
    );
}
