package com.springJpa.springJpa.Repository;

import com.springJpa.springJpa.Entity.Course;
import com.springJpa.springJpa.Entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseDsa = Course.builder()
                .title("dsa")
                .credit(3)
                .build();

        Course courseAop = Course.builder()
                .title("aop")
                .credit(5)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("mala")
                .lastName("perera")
                .courses(List.of(courseDsa,courseAop)).build();

        teacherRepository.save(teacher);
    }

}