package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvProperties {

    @Value("${env}")
    private String env;

    @Value("${stack}")
    private String stack;

    @Value("${tag}")
    private String tag;

    public String getEnv() {
        return env;
    }

    public String getStack() {
        return stack;
    }

    public String getTag() {
        return tag;
    }

    public String getUrl() {
        return "https://" + env + "/" + stack + "/" + tag;
    }
}
