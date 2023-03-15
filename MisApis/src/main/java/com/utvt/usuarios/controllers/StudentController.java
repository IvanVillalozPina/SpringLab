package com.utvt.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utvt.usuarios.model.dtos.StudentDto;
import com.utvt.usuarios.model.entities.Student;
import com.utvt.usuarios.model.services.StudentService;

@RestController
@RequestMapping("/api/usuarios")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll() {
		return ResponseEntity.ok().body(studentService.findAll());
	}
	
	@GetMapping("/all")
	public List<Student> findAllOther(){
		return studentService.findAll();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable Long id,@RequestBody Student student){
		return ResponseEntity.created(null).body(this.studentService.update(id, student));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> get(@PathVariable("id") Long id){
		return ResponseEntity.of(this.studentService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Student> save(@RequestBody Student student){
		return ResponseEntity.created(null).body(this.studentService.save(student));
	}
	
	@GetMapping("/findbyname")
	public ResponseEntity<StudentDto>findByFirstName(@RequestParam String name){
		return ResponseEntity.of(this.studentService.findByFirstname(name));
	}
	
	@GetMapping("/findbynamecontaining")
	public List<StudentDto> findByFirstnameContaining(@RequestParam String name){
		return this.studentService.findByFirstnameContaining(name);
	}
	
}
