package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jamie = new Student("Jamie","JamieDoyle@gmail.com",LocalDate.of(2000, AUGUST,23));
            Student michael = new Student("Michael","MichaelDoyle@gmail.com",LocalDate.of(2004, AUGUST,22));

            repository.saveAll(
                    List.of(jamie, michael)
            );
        };


    }

}//class
