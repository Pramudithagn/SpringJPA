package com.springJpa.springJpa.Repository;

import com.springJpa.springJpa.Entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void coursetTest(){

        Course course = Course.builder()
                .title("se")
                .credit(2)
                .build();

//        courseRepository.save();
    }

    @Test
    public void paginatedCourse(){
        Pageable pageable = PageRequest.of(0, 3);

        List<Course> courseList = courseRepository.findAll(pageable).getContent();

        int totalElements = (int) courseRepository.findAll(pageable).getTotalElements();

        long totalPages = courseRepository.findAll(pageable).getTotalPages();

        System.out.println("here courses" + courseList);
        System.out.println("here elements" + totalElements);
        System.out.println("here pages" + totalPages);

    }

    @Test
    public void sortedCourse(){
        Pageable pageableTitle = PageRequest.of(0, 3, Sort.by("title"));
        Pageable pageableDesc = PageRequest.of(0, 3, Sort.by("courseId").descending());


        List<Course> courseList = courseRepository.findAll(pageableDesc).getContent();

        int totalElements = (int) courseRepository.findAll(pageableDesc).getTotalElements();

        long totalPages = courseRepository.findAll(pageableDesc).getTotalPages();

        System.out.println("here courses" + courseList);
        System.out.println("here elements" + totalElements);
        System.out.println("here pages" + totalPages);

    }
}