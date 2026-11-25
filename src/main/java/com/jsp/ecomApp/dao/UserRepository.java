package com.jsp.ecomApp.dao;

import com.jsp.ecomApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("Select u from User u where u.email=?1")
    public Optional<User> findByEmail(String email);

    @Query("select count(u)>0 from User u where u.email=?1")
    boolean existsByEmail(String email);

    @Query("select count(u)>0 from User u where u.email=?1 and u.password=?2")
    boolean MatchEmailWithPassword(String email,String password);



}
