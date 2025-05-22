package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from users where email = :email", nativeQuery = true)
    Optional<User> findByEmail(String email);

//    @Query(value = "select u from User u where u.email = :email")
//    User findByEmail(String email);
//
//    User findByEmailAndAgeAfterAndBirth(String email, Integer age, LocalDate birth);
}
