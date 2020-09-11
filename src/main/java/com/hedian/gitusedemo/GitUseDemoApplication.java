package com.hedian.gitusedemo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class GitUseDemoApplication {

    public static void main(String[] args) {
        log.info("bugFix2");
        log.info("bugFix1");
        log.info("feature/1 1");
        log.info("feature/1 2");
        SpringApplication.run(GitUseDemoApplication.class, args);
        log.info("bugFix3");
    }

}
