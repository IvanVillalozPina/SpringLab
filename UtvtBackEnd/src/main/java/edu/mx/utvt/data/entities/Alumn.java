package edu.mx.utvt.data.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "1")
public class Alumn extends User {

	private static final long serialVersionUID = -5413670638009433599L;
	
	
	public Alumn (String username,String last_name, String birthday, String email, Boolean status ) {
		super(username, last_name,birthday, email, status);
		//TODO Auto-generate constructor stub
	}
	
	public Alumn (Long id,String username,String last_name, String birthday, String email, Boolean status,
	User user) {
		super (id, username, last_name,birthday, email, status, user);
		//TODO Auto-generate constructor stub
	}
	
	public Alumn (User user) {
		super(user);
	}
}
