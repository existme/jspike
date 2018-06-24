package com.existme.spike.services;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * If you use @Controller instead of @RestController the endpoint can't be found
 */
@RestController
public class MainController {

    Logger LOGGER= LogManager.getLogger(MainController.class.getName());

    @Value("${spike.message:test}")
    private String message = "Not configured";

    /* cannot override info endpoint */
    @RequestMapping(value = "/info2", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String info2() {
        LOGGER.warn(message);
        return message;
    }

}
