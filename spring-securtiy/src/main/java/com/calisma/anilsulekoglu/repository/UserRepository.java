package com.calisma.anilsulekoglu.repository;


import com.calisma.anilsulekoglu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}



