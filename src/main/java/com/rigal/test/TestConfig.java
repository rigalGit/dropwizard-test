package com.rigal.test;

import io.dropwizard.Configuration;

/**
 * Created by jitendragangwar on 1/13/17.
 */
public class TestConfig extends Configuration {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
