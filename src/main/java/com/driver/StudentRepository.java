package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	HashMap<String, Student> studentMap;
	HashMap<String, Teacher> teacherMap;
	HashMap<String, List<String>> studentteachermap;
	
	
	
      
	public StudentRepository() {
		super();
		// TODO Auto-generated constructor stub
		
		this.studentMap = new HashMap<>();
		this.teacherMap = new HashMap<>();
		this.studentteachermap = new HashMap<>();
	}



    //add student in studentMap
	public void addStudent(Student student) {
		   String name = student.getName();
		   studentMap.put(name, student);
	}
	
	//add teacher in teachermap
	public void addTeacher(Teacher teacher) {
		String name = teacher.getName();
		teacherMap.put(name, teacher);
	}
	
	//add student-teacher pair
	public void addStudentTeacherPair(String student, String teacher) {
		   List<String> students= studentteachermap.getOrDefault(teacher,new ArrayList<String>());
	       students.add(student);
	       studentteachermap.put(teacher,students);
	}
	
	
	//get student by name
	
	public Student getStudentByName(Student student) {
		return studentMap.get(student);
	}
	
	//get teacher by name
	public Teacher getTeacherByName(Teacher teacher) {
		return teacherMap.get(teacher);
	}
	
	//get student by teacher name
	public List<String> getStudentsByTeacherName(String teacher) {
		return new ArrayList<>(studentteachermap.get(teacher));
	}
	
	//get all student
		public List<String> getAllStudents() {
			return new ArrayList<>(studentMap.keySet());
		}
	
	//delete student by its teacher name
	public void deleteTeacherByName(String teacher) {
		List<String> students = new ArrayList<String>();
        if(studentteachermap.containsKey(teacher)){
            students = studentteachermap.get(teacher);
            for(String student: students){
                if(studentMap.containsKey(student)){
                    studentMap.remove(student);
                }
            }

            studentteachermap.remove(teacher);
        }

        if(teacherMap.containsKey(teacher)){
            teacherMap.remove(teacher);
        }
	}
	
	
	//delete all student and teacher
	public void deleteAllTeacher() {
		studentMap.clear();
		teacherMap.clear();
	}
}
