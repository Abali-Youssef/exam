package com.example.studentservice.query.repositories;

import com.example.studentservice.query.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
