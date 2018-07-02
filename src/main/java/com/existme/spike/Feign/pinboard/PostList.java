package com.existme.spike.Feign.pinboard;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.*;

import java.util.*;

/**
 * Converted using: http://www.jsonschema2pojo.org/
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "user",
        "posts"
})
public class PostList {

    @JsonProperty("date")
    public String date;
    @JsonProperty("user")
    public String user;
    @JsonProperty("posts")
    public List<PostEntity> posts = null;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("date", date).append("user", user).append("posts", posts).toString();
    }

}