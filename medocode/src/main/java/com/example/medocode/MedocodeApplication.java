package com.example.medocode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MedocodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedocodeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mo = new Student("mo", "laf", "mo@yahoo.com", 30);
            studentRepository.save(mo);
        };
    }
}
