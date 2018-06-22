package com.existme.spike.Feign.JsonPlaceholder;

import com.fasterxml.jackson.annotation.*;

public class PostEntity {

    public PostEntity() {
    }

    public PostEntity(Integer id, String title, String body, Integer userId) {
        Id = id;
        Title = title;
        Body = body;
        this.userId = userId;
    }

    @JsonProperty("id")
    public Integer Id;

    @JsonProperty("title")
    public String Title;

    @JsonProperty("body")
    public String Body;

    @JsonProperty("userId")
    public Integer userId;

    @Override
    public String toString() {
        return String.format("{\n" +
                        "   'id': %d,\n" +
                        "   'title': '%s',\n" +
                        "   'body': '%s',\n" +
                        "   'userId': %d\n" +
                        "}",
                Id, Title, Body, userId);
    }
}
