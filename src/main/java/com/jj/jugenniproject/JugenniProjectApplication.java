package com.jj.jugenniproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JugenniProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JugenniProjectApplication.class, args);
    }

}
