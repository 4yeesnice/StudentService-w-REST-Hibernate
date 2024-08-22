package com.example.StudentService.service;


import com.example.StudentService.model.Students;

import java.util.List;

public interface StudentService {

    // CRUD

    List<Students> showAllStudents();

    Students showStudentByEmail(String email);
    void saveStudent(Students student);
    void updateStudent(Students student);
    void deleteStudent(String email);






}
