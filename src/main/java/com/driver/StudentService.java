package com.driver;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
       
	 public ResponseEntity<String> addStudent(Student student);
}
