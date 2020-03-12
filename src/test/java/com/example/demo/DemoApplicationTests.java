package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private EnvProperties envProperties;

    @Test
    void checkUrl() {
        Assert.assertEquals("env", envProperties.getEnv());
        Assert.assertEquals("stack", envProperties.getStack());
        Assert.assertEquals("tag", envProperties.getTag());
        Assert.assertEquals("https://env/stack/tag", envProperties.getUrl());
    }

}
