package com.example.projectdemocrud.modules.users.repositories;

import com.example.projectdemocrud.modules.users.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
