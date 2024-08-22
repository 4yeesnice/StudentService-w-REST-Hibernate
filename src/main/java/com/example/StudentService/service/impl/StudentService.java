package com.example.StudentService.service.impl;

import com.example.StudentService.DAO.studentRepository;
import com.example.StudentService.model.Students;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@AllArgsConstructor
@Primary
public class StudentService implements com.example.StudentService.service.StudentService {

    private final studentRepository repository;

    @Override
    public List<Students> showAllStudents() {
        return repository.findAll();
    }

    @Override
    public Students showStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public void saveStudent(Students student) {
        repository.save(student);
    }

    @Override
    public void updateStudent(Students student) {
        repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteStudentByEmail(email);
    }
}
