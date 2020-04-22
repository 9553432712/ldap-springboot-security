package com.mahesh.ldapsecurity.dao;


/*
Author: Mahesh Punugupati
*/


import com.mahesh.ldapsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer> {
}
