package me.jianghs.springscaffold.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jianghs430
 */
@SpringBootApplication(scanBasePackages = "me.jianghs.springscaffold")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
