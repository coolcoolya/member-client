package com.example.memberclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MemberClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberClientApplication.class, args);
    }

}
