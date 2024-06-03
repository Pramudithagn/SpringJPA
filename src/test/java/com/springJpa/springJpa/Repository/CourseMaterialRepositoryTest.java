package com.springJpa.springJpa.Repository;

import com.springJpa.springJpa.Entity.Course;
import com.springJpa.springJpa.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

        @Autowired
        private CourseMaterialRepository courseMaterialRepository;

        @Test
        public void courseMaterialSaveTest(){

            Course course = Course.builder()
                    .title("oop")
                    .credit(2)
                    .build();

            CourseMaterial courseMaterial = CourseMaterial.builder()
                    .url("www.oop")
                    .course(course)
                    .build();

            courseMaterialRepository.save(courseMaterial);
        }

        @Test
        public void courseMaterialFetchTest(){
            List<CourseMaterial> list = courseMaterialRepository.findAll();

            System.out.println(list);
        }
}
