package edu.mx.utvt;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mx.utvt.data.repositories.UserRepository;

@SpringBootTest
public class OneToMany {
	
	@Autowired
	private UserRepository userRepository;
	

}
