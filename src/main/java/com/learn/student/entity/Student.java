package com.learn.student.entity;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "students")
public class Student {
 
   @Id
   private int studentId;
 
   private String studentName;

   public Student() {
   }
 
   public Student(int studentId, String studentName) {
       this.studentId = studentId;
       this.studentName = studentName;
   }
 
   public int getStudentId() {
       return studentId;
   }
 
   public void setStudentId(int studentId) {
       this.studentId = studentId;
   }
 
   public String getStudentName() {
       return studentName;
   }
 
   public void setStudentName(String studentName) {
       this.studentName = studentName;
   }
}
 
 