package com.mahesh.ldapsecurity.service;


/*
Author: Mahesh Punugupati
*/

import com.mahesh.ldapsecurity.dao.UserDao;
import com.mahesh.ldapsecurity.dto.UserDto;
import com.mahesh.ldapsecurity.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public UserDto saveUser(UserDto userDto) {
        UserEntity userEntity = userDao.saveUser(userDto.toData());
        return userEntity.toData();
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserEntity> getUsers() {
        return userDao.getUsers();
    }
}
