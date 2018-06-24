package com.existme.spike;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.feign.*;
import org.springframework.context.*;


@SpringBootApplication
@EnableFeignClients
public class SpikeApplication implements CommandLineRunner {
    private Logger LOGGER = LogManager.getLogger(SpikeApplication.class.getName());

    @Autowired
    public SpikeApplication(ApplicationContext appContext) {
        this.appContext = appContext;
    }

    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication app = new org.springframework.boot.SpringApplication(SpikeApplication.class);
        app.setLogStartupInfo(false);
        app.setBannerMode(Banner.Mode.OFF);
        app.setDefaultProperties(new java.util.Properties());
        app.run(args);
//		SpringApplication.run(SpikeApplication.class, args);
    }

    final Marker APIINFO_MARKER = MarkerManager.getMarker("apiinfo");

    @Override
    public void run(String... args) {
        LOGGER.info("Spring Application has started with {}# of args", String.join(",",args));
    }

    public void aTestMethod() {

        // LOGGER.entry/exit will only appear if TRACE level is used!
        LOGGER.entry("arg1", "arg2");
        LOGGER.warn(APIINFO_MARKER, "Test method called :\n {}", "testValue");
        LOGGER.traceExit();
    }

    public void exitApplication() {
        SpringApplication.exit(appContext, () -> 1);
    }
}
