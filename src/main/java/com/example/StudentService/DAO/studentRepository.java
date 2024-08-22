package com.example.StudentService.DAO;

import com.example.StudentService.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface studentRepository extends JpaRepository<Students, Long>{


    void deleteStudentByEmail(String email);
    Students findStudentByEmail(String email);
}
