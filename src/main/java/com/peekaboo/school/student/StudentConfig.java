package com.peekaboo.school.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

            Student sudent1 = new Student("Tanmay Kumar", LocalDate.of(1999, 5, 1), "ktanmay5149@gmail.com");
            Student sudent2 = new Student("Rahul Kumar", LocalDate.of(1998, 5, 1), "rahul@gmail.com");

            studentRepository.saveAll(List.of(sudent1, sudent2));

        };
    }

}
