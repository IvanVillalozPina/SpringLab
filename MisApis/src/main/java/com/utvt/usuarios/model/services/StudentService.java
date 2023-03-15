package com.utvt.usuarios.model.services;

import java.util.List;
import java.util.Optional;

import com.utvt.usuarios.model.dtos.StudentDto;
import com.utvt.usuarios.model.entities.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Optional<Student> findById(Long Id);
	
	public Student save(Student student);
	
	public void deleteById(Long id);
	
	public Student update(Long id, Student currentStudent);
	
	public Optional<StudentDto> finByFirstname(String firstname);
	
	public List<Student> findByFirstnameContaining(String firstname);
	
}
