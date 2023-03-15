package edu.mx.utvt.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.utvt.data.entities.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Long> {

}
