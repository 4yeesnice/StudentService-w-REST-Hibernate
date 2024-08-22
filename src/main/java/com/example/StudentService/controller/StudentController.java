package com.example.StudentService.controller;


import com.example.StudentService.model.Students;
import com.example.StudentService.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {


    private final StudentService service;


    @GetMapping
    public List<Students> findAllStudents(){
        // todo
        return service.showAllStudents();

    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Students student){
        service.saveStudent(student);
        return String.format("Successfully saved student: %s", student.getFirstName());
    }


    @GetMapping("/{email}")
    public Students findStudentByEmail(@PathVariable String email){
        return service.showStudentByEmail(email);
    }

    @PutMapping("update_student")
    public void updateStudent(@RequestBody Students student){
        service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }


}
