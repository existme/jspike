package com.existme.spike.Feign.JsonPlaceholder;

import com.existme.spike.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import org.apache.logging.log4j.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

import java.io.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonClientTest {
    Logger LOGGER = LogManager.getLogger(SpikeApplicationTests.class.getName());

    @Autowired
    private JsonClient jsonClient;

    @Test
    public void getPostsById() throws IOException {
        String posts = jsonClient.getPosts(1);
        JsonNode res = new ObjectMapper().readTree(posts);
        LOGGER.info(res);
        assertEquals(JsonNodeType.OBJECT, res.getNodeType());
    }

    @Test
    public void getPosts() throws IOException {
        String posts = jsonClient.getPosts();
        JsonNode res = new ObjectMapper().readTree(posts);
        LOGGER.info("Retrieved [{}] Posts", res.size());
        assertEquals(JsonNodeType.ARRAY, res.getNodeType());
    }

    @Test
    public void createPost() {
        PostEntity postEntity = new PostEntity(null, "test", "test creating a new post", 1);
        PostEntity res = jsonClient.createPost(postEntity);
        LOGGER.info(res);
        assertNotNull(res.Id);
    }
}