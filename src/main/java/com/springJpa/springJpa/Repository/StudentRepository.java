package com.springJpa.springJpa.Repository;

import com.springJpa.springJpa.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String FirstName);
    List<Student> findByFirstNameContaining(String FirstName);
    Student findByFirstNameAndLastName(String firstName, String lastName);

    @Query("select s.firstName from Student s where s.email = ?1")
    String emailByFirstName (String email);

    @Query(value = "select * from student_table where email_address = ?1", nativeQuery = true)
    String emailByFirstNameNative (String email);

    @Query(value = "select * from student_table where email_address = :email", nativeQuery = true)
    String emailByFirstNameNativeParam (@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value = "update student_table set first_name= ?1 where email_address = ?2", nativeQuery = true)
    int updateByEmail (String updateName, String email);
}
