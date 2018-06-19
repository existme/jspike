package com.existme.spike;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import static org.springframework.boot.Banner.*;

@SpringBootApplication
public class SpikeApplication {

	public static void main(String[] args) {
		SpringApplication app = new org.springframework.boot.SpringApplication(SpikeApplication.class);
		app.setLogStartupInfo(false);
		app.setBannerMode(Mode.OFF);
		app.setDefaultProperties(new java.util.Properties());
		app.run(args);
//		SpringApplication.run(SpikeApplication.class, args);

	}
}
