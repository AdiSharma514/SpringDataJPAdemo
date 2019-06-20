package com.gfg.springJPAdemo.SpringDataJPAdemo.repository;

import com.gfg.springJPAdemo.SpringDataJPAdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByFirstName(String firstName);
    List<User> findByFirstNameAndLastName(String firstName,String lastName);
}
