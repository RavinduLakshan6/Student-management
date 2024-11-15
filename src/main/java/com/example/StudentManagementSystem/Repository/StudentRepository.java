package com.example.StudentManagementSystem.Repository;

import com.example.StudentManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByYearOfEnrollment(String yearOfEnrollment);
    @Query(value = "SELECT department FROM Students WHERE id = ?1",nativeQuery = true)
    String findDepartmentById (Long id);
}
