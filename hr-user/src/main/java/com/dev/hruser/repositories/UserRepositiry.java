package com.dev.hruser.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.dev.hruser.entities.User;
import java.util.List;


public interface UserRepositiry extends JpaRepositoryImplementation<User, Long> {
	
	User findByEmail(String email);
}
