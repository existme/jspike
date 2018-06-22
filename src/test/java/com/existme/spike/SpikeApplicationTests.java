package com.existme.spike;

import org.apache.logging.log4j.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpikeApplicationTests {

    Logger LOGGER= LogManager.getLogger(SpikeApplicationTests.class.getName());

    @Test
	public void contextLoads() {
	}

}
