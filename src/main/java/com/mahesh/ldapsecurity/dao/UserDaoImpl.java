package com.mahesh.ldapsecurity.dao;


/*
Author: Mahesh Punugupati
*/

import com.mahesh.ldapsecurity.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity saveUser(UserEntity userDto) {
        return userRepository.save(userDto);
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public UserEntity updateUser(UserEntity userDto) {
        return null;
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
