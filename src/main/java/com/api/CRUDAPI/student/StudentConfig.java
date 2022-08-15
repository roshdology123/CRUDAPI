package com.api.CRUDAPI.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args-> {
            Student abdallah = new Student(
                    "Abdallah",
                    "abdallahelswify@gmail.com",
                    LocalDate.of(2002, JANUARY, 21)

            );
            Student roshdy = new Student(
                    "Roshdy",
                    "abdallahroshdy@gmail.com",
                    LocalDate.of(2001, FEBRUARY, 20)
            );

            repository.saveAll(
                    List.of(abdallah,roshdy)
            );
        };
    }
}
