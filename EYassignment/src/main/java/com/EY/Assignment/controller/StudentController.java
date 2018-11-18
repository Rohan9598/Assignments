package com.EY.Assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EY.Assignment.model.Student;
import com.EY.Assignment.service.StudentService;

@RestController
public class StudentController 
{
@Autowired
private StudentService studentservice;

@GetMapping("/getall")
public List<Student> getAllStudent()
{
	return studentservice.getAll();
	
}

@GetMapping("/get/{student_id}")
public Optional<Student> getTopic(@PathVariable Integer student_id)
{
	return studentservice.getStudent(student_id);
}

@PostMapping("/adddetails")
public void addDetails(@RequestBody Student stud)
{
	studentservice.addDetails(stud);
}

@PutMapping("/update/{student_id}")
public String updatebook(@RequestBody Student stud,@PathVariable Integer student_id)
{
	studentservice.updateDetails(stud,student_id);
	 return "updated";
}

@DeleteMapping("/delete/{student_id}")
public void deleteStudent(@PathVariable Integer student_id)
	{
		studentservice.deleteDetails(student_id);
	}

}

