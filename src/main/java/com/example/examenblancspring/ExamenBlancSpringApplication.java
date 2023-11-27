package com.example.examenblancspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ExamenBlancSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenBlancSpringApplication.class, args);
    }

}
