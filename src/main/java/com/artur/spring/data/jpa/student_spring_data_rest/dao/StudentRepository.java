package com.artur.spring.data.jpa.student_spring_data_rest.dao;

import com.artur.spring.data.jpa.student_spring_data_rest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
