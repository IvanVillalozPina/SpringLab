package edu.mx.utvt.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "2")
public class Admin extends User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column (name = "salary", nullable = false)
	private Double salary;
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public Admin() {
		super();
	}
	
	public Admin(String username,String last_name, String birthday, String email, Boolean status) {
		super(username, last_name,birthday, email, status);
	}
	
	public Admin (Long id,String username,String last_name, String birthday, String email, Boolean status, User user) {
		super(id, username, last_name,birthday, email, status, user);
	}
	
	public Admin (User user) {
		super (user);
	}

	
	
	

}
