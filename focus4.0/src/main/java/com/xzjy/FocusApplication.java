package com.xzjy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FocusApplication {

    public static void main(String[] args) {
        log.info("项目气动成功");

        SpringApplication.run(FocusApplication.class, args);
    }

}
