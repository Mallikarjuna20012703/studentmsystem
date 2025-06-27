package com.example.springbootmvc.repository;

import com.example.springbootmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
