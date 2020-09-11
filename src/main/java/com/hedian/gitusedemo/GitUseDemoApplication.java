package com.hedian.gitusedemo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class GitUseDemoApplication {

    public static void main(String[] args) {
        log.info("111");
        SpringApplication.run(GitUseDemoApplication.class, args);
    }

}
