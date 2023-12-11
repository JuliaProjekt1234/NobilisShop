package com.example.nobilisshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.nobilisshop.repository")
public class NobilisShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(NobilisShopApplication.class, args);
    }

}
