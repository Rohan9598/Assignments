package com.EY.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EY.Assignment.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	
	
}
