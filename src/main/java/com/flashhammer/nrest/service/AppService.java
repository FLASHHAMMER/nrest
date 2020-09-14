package com.flashhammer.nrest.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public AppService() {
    }

    public String hello(int code) {
        String hi = null;
        if (code == 1) {
            hi = "Hello!";
        }
        return hi;

    }

}
