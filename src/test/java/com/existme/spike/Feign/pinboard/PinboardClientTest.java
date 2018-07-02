package com.existme.spike.Feign.pinboard;

import org.apache.logging.log4j.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PinboardClientTest {

    Logger LOGGER = LogManager.getLogger(PinboardClientTest .class.getName());

    @Autowired
    private PinboardClient pinboardClient;

    @Test
    public void getRecentPosts() {
        PostList i3 = pinboardClient.getRecentPosts("i3", 100);
        LOGGER.info(i3);
    }

    @Test
    public void getAllPosts() {
        List<PostEntity> allPosts = pinboardClient.getAllPosts(null,0);
        LOGGER.info(allPosts);
        LOGGER.info(allPosts.size());
    }
}