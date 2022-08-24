package com.amigos.student.studentamigos.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> students(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student newStudent) {

        Optional<Student> studentOptional = studentRepository.findStudentByEmail(newStudent.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalArgumentException("Email taken");
        }
        studentRepository.save(newStudent);
    }

    public void deleteStudent(Long studentId) {
        boolean exits = studentRepository.existsById(studentId);

        if(!exits){
            throw new IllegalArgumentException("Student with id "+studentId+" not exist ");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public Student updateStudent(Student studentUpdate){

        return null;
    }
}
