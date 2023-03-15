package edu.mx.utvt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.mx.utvt.data.entities.Admin;
import edu.mx.utvt.data.entities.Alumn;
import edu.mx.utvt.data.entities.User;
import edu.mx.utvt.data.repositories.UserRepository;

@SpringBootTest
public class Herencia {
	
	@Autowired
	private UserRepository userRepo;
	
	//@Test
	public void addNewAlumn() {
		Alumn alumno = null;
		alumno = new Alumn("Ivan", "Villaloz", "17-11-2001","al22@gmail.com", true);
		this.userRepo.save(alumno);
	}
		
	@Test
	public void addNewAdmin() {
		Admin admin = null;
		admin = new Admin("IvaN", "VillaloZ", "17-11-2001", "adm@gmail.com", true);
		admin.setSalary(90.0);
		this.userRepo.save(admin);
	}
	
    //@Test
    public void updateAdmin(){
        long toFindId = 5L;
        User user = this.userRepo.findById(toFindId).orElse(null);
        if (user != null){
            Admin admin = null;
            admin = new Admin(user);
            admin.setSalary(101.1);
            this.userRepo.save(admin);
        }
    }
    
    //@Test
    public void deleteAdministrator(){
        long toFindId = 4L;
        User user = this.userRepo.findById(toFindId).orElse(null);
        if (user != null){
            Admin admin = null;
            admin = new Admin(user);
            this.userRepo.delete(admin);
        }
    }
	
    //@Test
    public void updateAdministratorTwo(){
        long toFindId = 6L;
        User user = this.userRepo.findById(toFindId).orElse(null);
        if (user != null){
            Admin admin = null;
            admin = new Admin(user);
            admin.setSalary(101.1);
            admin.setUsername("Vladimir");
            admin.setLast_name("BloodLord");
            admin.setBirthday("11-11-1200");
            admin.setEmail("vlad@overlord.com");
            admin.setStatus(false);
            this.userRepo.save(admin);
        }
    }
    
}
