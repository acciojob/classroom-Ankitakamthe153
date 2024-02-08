package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
       
	//add student
	 public void addStudent(Student student){
		studentRepository.addStudent(student);
	 }
	 
	 //add teacher
	 public void addTeacher(Teacher teacher) {
		studentRepository.addTeacher(teacher);
	}
	 
	 
	 //add student-teacher-pair
	 
	 public void addStudentTeacherPair(String student , String teacher) {
		studentRepository.addStudentTeacherPair(student, teacher);
	}
	 
	 
	 //get student by name
	 
	 public Student getStudentByName(Student student) {
		return studentRepository.getStudentByName(student);
	}
	 
	 
	 //get teacher by name
	 
	 public Teacher getTeacherByName(Teacher teacher) {
		return studentRepository.getTeacherByName(teacher);
	}
	 
	 //get student by teacher name
	 public List<String> getStudentsByTeacherName(String teacher) {
		return studentRepository.getStudentsByTeacherName(teacher);
	}
	 
	 //get all student
	 public List<String> getAllStudents(){

	        return studentRepository.getAllStudents();
	    }

	 
	 
	 //delete student by its teacher name
	 public void namedeleteTeacherByName(String teacher) {
		studentRepository.deleteTeacherByName(teacher);
	}
	 
	 //delete all student and teacher
	 public void deleteAllTeacher() {
		studentRepository.deleteAllTeacher();
	}
	 
	 
	 
}
