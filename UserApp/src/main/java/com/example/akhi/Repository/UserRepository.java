package com.example.akhi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.akhil.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
