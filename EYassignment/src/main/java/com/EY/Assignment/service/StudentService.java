package com.EY.Assignment.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EY.Assignment.model.Student;
import com.EY.Assignment.repository.StudentRepository;
@Service
public class StudentService 
{
	
	@Autowired
	private StudentRepository studentrepo;
	
	public List<Student> getAll()
	{
		return studentrepo.findAll();
			
	}
	
	public Optional<Student> getStudent(Integer student_id)
	{
		return studentrepo.findById(student_id);
		
	}

	public void addDetails(Student stud) {
		studentrepo.save(stud);
	}


	public void deleteDetails(Integer student_id) {
		studentrepo.deleteById(student_id);
		
	}

	public void updateDetails(Student stud,Integer student_id)
	{
		studentrepo.save(stud);
	}
	

}
