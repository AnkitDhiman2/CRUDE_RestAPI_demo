package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class Studentonfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student james = new Student(
                    "Loda James",
                    "james.loda@gmail.com",
                    LocalDate.of(2000, JANUARY,3)

            );
            Student alex = new Student(
                    "Alex hang",
                    "Alex.hang@gmail.com",
                    LocalDate.of(1999, FEBRUARY,3)

            );

            repository.saveAll(List.of(james,alex));
        };

    };


}
