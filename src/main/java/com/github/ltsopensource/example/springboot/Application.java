package com.github.ltsopensource.example.springboot;

import com.github.ltsopensource.spring.boot.annotation.EnableJobClient;
import com.github.ltsopensource.spring.boot.annotation.EnableJobTracker;
import com.github.ltsopensource.spring.boot.annotation.EnableTaskTracker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableJobTracker
@EnableTaskTracker
@EnableJobClient
@ComponentScan("com.github.ltsopensource.example")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
