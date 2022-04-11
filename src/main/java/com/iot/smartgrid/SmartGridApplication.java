package com.iot.smartgrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories
@SpringBootApplication
public class SmartGridApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartGridApplication.class, args);
    }

}
