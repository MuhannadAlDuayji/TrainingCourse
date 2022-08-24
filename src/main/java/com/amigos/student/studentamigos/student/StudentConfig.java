package com.amigos.student.studentamigos.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
             Student mariam = new Student(
                     "Mariam"
                     ,"Mariam@gmail.com"
                    , LocalDate.of(2000, Month.JANUARY,5)
                    );
             Student alex = new Student(
                     "Alex"
                     ,"Alex@gmail.com"
                     , LocalDate.of(2004, Month.JANUARY,5)
                    );
             studentRepository.saveAll(
                     Arrays.asList(mariam,alex)
             );
        };
    }
}
