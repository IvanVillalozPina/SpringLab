package edu.mx.utvt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.mx.utvt.data.entities.User;
import edu.mx.utvt.data.repositories.UserRepository;

@SpringBootTest
public class UserTest {
    @Autowired
    public UserRepository userRepository;
/*
   @Test
   public void createUser(){
       User user = new User("Iván", "1234");
       this.userRepository.save(user);
   }

    @Test
 public void createUserTwo(){
    User user = new User("Pablo", "4321");
    this.userRepository.save(user);
  }

    @Test
    public void updateUser(){
        User user = this.userRepository.findById(2L).orElse(null);
        if (user != null){
            user.setUsername("Thana");
            this.userRepository.save(user);
        }
    }

    @Test
    public void deleteUser(){
        User user = this.userRepository.findById(2L).orElse(null);
        if (user != null){
            this.userRepository.delete(user);
        }
    }
*/
}
