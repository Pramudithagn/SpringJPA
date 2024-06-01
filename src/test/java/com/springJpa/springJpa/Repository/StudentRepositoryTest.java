package com.springJpa.springJpa.Repository;

import com.springJpa.springJpa.Entity.Guardian;
import com.springJpa.springJpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .firstName("NimalJR")
                .lastName("Jayasinghe")
                .email("nimaljr@gmail.com")
//                .guardianName("Nimal")
//                .guardianEmail("nimaljr@gmail.com")
//                .guardianMobile("3425453")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .Name("Hemal")
                .Email("hemal@gmail.com")
                .Mobile("7686853")
                .build();

        Student student = Student.builder()
                .firstName("HemalJR")
                .lastName("Ranasinghe")
                .email("hemaljr@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void getStudent(){
//        List<Student> list  = studentRepository.findAll();
//        System.out.println(list);

//        List<Student> list  = studentRepository.findByFirstName("Hemal");
//        System.out.println(list);

//        List<Student> list  = studentRepository.findByFirstNameContaining("al");
//        System.out.println(list);

//        Student student  = studentRepository.findByFirstNameAndLastName("Hemal","Ranasinghe");
//        System.out.println(student);

//        String student  = studentRepository.emailByFirstName("hemaljr@gmail.com");
//        System.out.println(student);

//        String student  = studentRepository.emailByFirstNameNative("hemaljr@gmail.com");
//        System.out.println(student);

//        String student  = studentRepository.emailByFirstNameNativeParam("hemaljr@gmail.com");
//        System.out.println(student);

        int updated = studentRepository.updateByEmail("HemalJr", "hemaljr@gmail.com");
        System.out.println(updated);
    }

}