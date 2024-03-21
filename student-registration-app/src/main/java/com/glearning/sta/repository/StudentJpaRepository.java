package com.glearning.sta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.sta.entity.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student,Integer>{		

}
