package com.laioffer.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true) //?
@JsonInclude(JsonInclude.Include.NON_NULL) // ?
@JsonDeserialize(builder = Game.Builder.class) // ??


public class Game {
    @JsonProperty("name")
    private final String name;

    @JsonProperty("id")
    private final String id;

    @JsonProperty("box_art_url")
    private final String boxArtUrl;


    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getBoxArtUrl() {
        return boxArtUrl;
    }


    public Game(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.boxArtUrl = builder.boxArtUrl;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Builder {
        @JsonProperty("name")
        private String name;

        @JsonProperty("id")
        private String id;

        @JsonProperty("box_art_url")
        private String boxArtUrl;


        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder boxArtUrl(String boxArtUrl) {
            this.boxArtUrl = boxArtUrl;
            return this;
        }

        public Game build() {
            return new Game(this);
        }

    }

}
