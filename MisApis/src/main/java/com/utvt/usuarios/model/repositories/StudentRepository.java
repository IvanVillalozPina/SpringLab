package com.utvt.usuarios.model.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utvt.usuarios.model.dtos.StudentDto;
import com.utvt.usuarios.model.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public Optional<StudentDto> findByFirstname(String firstname);
	
	public List<StudentDto> findByFirstnameContaining(String fisrtname);

}
