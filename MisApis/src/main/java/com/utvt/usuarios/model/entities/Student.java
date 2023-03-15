package com.utvt.usuarios.model.entities;

import java.sql.Date;
// import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "te_students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "firstname", nullable = false, length = 50)
	private String fistname;
	
	@Column(name = "lastname", nullable = false, length = 100)
	private String lastname;
	
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	
	@Column(name = "age", nullable = false)
	private Integer age;
	
	@Column(name = "gender", nullable = false)
	private Integer gender;
	
	@Column(name = "created_at", insertable = false, updatable = false)
	private Date createdAt;
	
	
}
