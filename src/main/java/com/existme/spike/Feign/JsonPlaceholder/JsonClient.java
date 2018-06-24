package com.existme.spike.Feign.JsonPlaceholder;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "restapiapplication",url = "https://jsonplaceholder.typicode.com/")
public interface JsonClient {

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    String getPosts(@PathVariable(value = "id") Integer id);

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    String getPosts();

    @RequestMapping(path = "/posts", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    PostEntity createPost(PostEntity entityObject);

}
