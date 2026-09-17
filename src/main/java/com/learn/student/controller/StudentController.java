package com.learn.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.learn.student.entity.Student;
import com.learn.student.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

private final StudentService studentService;

public StudentController(StudentService studentService) {
this.studentService = studentService;
}

@PostMapping
public Student addStudent(@RequestBody Student student) {
return studentService.saveStudent(student);
}

@GetMapping
public List<Student> getAllStudents() {
return studentService.getAllStudents();
}

@GetMapping("/{id}")
public Student getStudent(@PathVariable int id) {
return studentService.getStudentById(id);
}

@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable int id) {

studentService.deleteStudent(id);

return "Student deleted successfully";
}

@DeleteMapping("/name/{studentName}")
public String deleteStudentByName(@PathVariable String studentName) {

studentService.deleteStudentByName(studentName);

return "Student deleted successfully";
}

@DeleteMapping
public String deleteStudentByBody(@RequestBody Student student) {

studentService.deleteStudentByName(student.getStudentName());

return "Student deleted successfully";
}

@PutMapping("/{id}")
public Student updateStudent(
        @PathVariable int id,
        @RequestBody Student student) {

    return studentService.updateStudent(id, student);
}
}
 