package com.example.StudentService.service.impl;


import com.example.StudentService.DAO.InMemoryStudentDAO;
import com.example.StudentService.model.Students;
import com.example.StudentService.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
//Students.builder().firstName("John").email("john@mail.com").age(20).build(),
//                Students.builder().firstName("Alexa").email("alexa@gmail.usa").age(22).build(),
//                Students.builder().firstName("Vlad").email("vlad@yahoo.com").age(23).build()

    private final InMemoryStudentDAO studentDAO;


    @Override
    public List<Students> showAllStudents() {
        return studentDAO.showAllStudents();
    }

    @Override
    public Students showStudentByEmail(String email) {
        return studentDAO.showStudentByEmail(email);
    }

    @Override
    public void saveStudent(Students student) {
        studentDAO.saveStudent(student);
    }

    @Override
    public void updateStudent(Students student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentDAO.deleteStudent(email);
    }
}
