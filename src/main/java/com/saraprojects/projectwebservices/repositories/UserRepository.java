package com.saraprojects.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saraprojects.projectwebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
