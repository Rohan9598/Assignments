package com.EY.Assignment.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="student")
@EntityListeners(AuditingEntityListener.class)
public class Student
{
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int studentId;
private String name;
private String course;
private String address;
public Student() {}

public Student(int studentId, String name, String course, String address) {
	
	this.studentId = studentId;
	this.name = name;
	this.course = course;
	this.address = address;
}

public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
};

}