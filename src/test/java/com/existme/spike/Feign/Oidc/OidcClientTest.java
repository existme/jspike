package com.existme.spike.Feign.Oidc;

import org.apache.logging.log4j.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OidcClientTest {
    Logger LOGGER = LogManager.getLogger(OidcClientTest.class.getName());

    @Autowired
    private OidcClient oidcClient;

    @Test
    public void getWellkownResponse() {
        WellknownEntity res = oidcClient.getWellkownResponse();
        LOGGER.warn(res.authorization_endpoint);
    }

}