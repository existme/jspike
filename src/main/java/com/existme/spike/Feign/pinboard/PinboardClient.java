package com.existme.spike.Feign.pinboard;

import org.springframework.cloud.netflix.feign.*;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Configuration
@FeignClient(value = "pinboardClient", url="${feign.client.config.pinboard.root}"
//        , configuration = FeignConfig.class
)
public interface PinboardClient {

    /**
     * Returns a list of the user's most recent posts, filtered by tag.
     * @return
     */
    @RequestMapping(path = "/posts/recent?tag={tag}&count={count}&auth_token=${pinboard.auth_token}&format=json", method = RequestMethod.GET)
    PostList getRecentPosts(
            // filter by up to three tags
            @PathVariable("tag") String tag,
            // number of results to return. Default is 15, max is 100
            @PathVariable("count") Integer count);

    /**
     * Returns all bookmarks in the user's account.
     *
     * @param tag           filter by up to three tags
     * @param results       number of results to return. Default(0) is all
     * @return              List<PostEntity>
     */
    @RequestMapping(path = "/posts/all?tag={tag}&results={results}&auth_token=${pinboard.auth_token}&format=json", method = RequestMethod.GET)
    List<PostEntity> getAllPosts(
            @PathVariable("tag") String tag,
            @PathVariable("results") Integer results
    );

}
