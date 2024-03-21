package com.glearning.sta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.sta.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
