package com.room18.individualaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EntityScan(basePackages = "com.room18.common.entity")
public class IndividualAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndividualAccountApplication.class, args);
    }

}
