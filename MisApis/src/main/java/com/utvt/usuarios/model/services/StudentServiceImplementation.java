package com.utvt.usuarios.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.utvt.usuarios.model.dtos.StudentDto;
import com.utvt.usuarios.model.entities.Student;
import com.utvt.usuarios.model.repositories.StudentRepository;

import jakarta.transaction.Transactional;

public class StudentServiceImplementation implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional(readOnly = true)
	public List<Student> findAll(){
		return this.studentRepository.findAll();
	}
	
	@Transactional
	public Optional<Student> findById(Long Id){
		return this.studentRepository.findById(Id);
	}
	
	@Transactional
	public Student update(Long id, Student currentStudent) {
		Optional<Student> student = null;
		
		student = this.studentRepository.findById(id);
		
		if(student.isPresent()) {
			
			student.get().setFirstname(currentStudent.getFirstname());
			student.get().setLastname(currentStudent.getLastname());
			student.get().setAge(currentStudent.getAge());
			student.get().setGender(currentStudent.getGender());
			this.studentRepository.save(student.get());

		}
		return student.orElseThrow();
	}
	
	@Transactional
	public Student save(Student student) {
		return this.studentRepository.saveAndFlush(student);
	}
	
	@Transactional
	public void deleteById(Long id) {
		this.studentRepository.deleteById(id);
	}
	
	@Transactional(readOnly = true)
	public Optional<StudentDto> findByFirstname(String firstname){
		return this.studentRepository.findByFirstname(firstname);
	}
	
	@Transactional(readOnly = true)
	public List<StudentDto> findByFirstnameContaining(String firstname){
		return this.studentRepository.findByFirstnameContaining(firstname);
	}

}
