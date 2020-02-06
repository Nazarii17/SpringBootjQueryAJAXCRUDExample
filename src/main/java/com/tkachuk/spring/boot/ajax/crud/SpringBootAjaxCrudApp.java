package com.tkachuk.spring.boot.ajax.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tkachuk.spring.boot.ajax.crud")
public class SpringBootAjaxCrudApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAjaxCrudApp.class, args);
    }

}