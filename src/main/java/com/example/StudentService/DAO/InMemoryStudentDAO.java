package com.example.StudentService.DAO;

import com.example.StudentService.model.Students;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;



@Repository
public class InMemoryStudentDAO {

    private final List<Students> STUDENTS = new ArrayList<>();

    
    public List<Students> showAllStudents() {
        return STUDENTS;
    }

    
    public Students showStudentByEmail(String email) {
        return STUDENTS.stream()
                .filter(students -> students.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    
    public void saveStudent(Students student) {
        STUDENTS.add(student);
    }

    
    public void updateStudent(Students student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> STUDENTS.get(i).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);

        if (studentIndex != -1) {
            STUDENTS.set(studentIndex, student);
        }
        
    }

    
    public void deleteStudent(String email) {
        var student = showStudentByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }





}
