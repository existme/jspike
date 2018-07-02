package com.existme.spike.Feign.pinboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Converted using: http://www.jsonschema2pojo.org/
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "href",
        "description",
        "extended",
        "meta",
        "hash",
        "time",
        "shared",
        "toread",
        "tags"
})
public class PostEntity {

    @JsonProperty("href")
    public String href;
    @JsonProperty("description")
    public String description;
    @JsonProperty("extended")
    public String extended;
    @JsonProperty("meta")
    public String meta;
    @JsonProperty("hash")
    public String hash;
    @JsonProperty("time")
    public String time;
    @JsonProperty("shared")
    public String shared;
    @JsonProperty("toread")
    public String toread;
    @JsonProperty("tags")
    public String tags;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("href", href).append("description", description).append("extended", extended).append("meta", meta).append("hash", hash).append("time", time).append("shared", shared).append("toread", toread).append("tags", tags).toString();
    }

}