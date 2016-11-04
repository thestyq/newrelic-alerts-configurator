package com.ocado.pandateam.newrelic.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.List;

@Value
public class UserList implements ObjectList<User> {
    @JsonProperty("users")
    List<User> list;
}
