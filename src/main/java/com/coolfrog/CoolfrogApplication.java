package com.coolfrog;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoolfrogApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CoolfrogApplication.class, args);
    }

}
