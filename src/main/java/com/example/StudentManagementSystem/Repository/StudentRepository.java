package com.example.StudentManagementSystem.Repository;

import com.example.StudentManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
