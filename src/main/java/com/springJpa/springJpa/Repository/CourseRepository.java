package com.springJpa.springJpa.Repository;

import com.springJpa.springJpa.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
