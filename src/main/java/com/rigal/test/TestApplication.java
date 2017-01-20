package com.rigal.test;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by jitendragangwar on 1/13/17.
 */
public class TestApplication extends Application<TestConfig> {
    public void run(TestConfig configuration, Environment environment) throws Exception {
        TestResource testResource = new TestResource();
        environment.jersey().register(testResource);
        environment.jersey().register(new RequestFilter());
    }

    public static void main(String[] args) throws Exception {
        TestApplication testApplication = new TestApplication();
        testApplication.run(args);
    }
}
