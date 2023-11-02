package com.example.Akhil.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Akhil.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long > {

}
