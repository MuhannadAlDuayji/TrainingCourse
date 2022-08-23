package com.amigos.student.studentamigos.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> students(){
        return Arrays.asList(new Student(1L,"Mariam","mariam.jamal@gmail.com"
                , LocalDate.of(2000, Month.JANUARY,5)
                ,21));
    }
}
