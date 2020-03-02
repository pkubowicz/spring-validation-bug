package com.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class UserDto {
    private final String id;
    private final String name;

    @JsonCreator
    public UserDto(
            @JsonProperty("id") String id,
            @JsonProperty("roles") String name) {
        this.id = Objects.requireNonNull(id);
        this.name = name;
    }

    @NotBlank
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
