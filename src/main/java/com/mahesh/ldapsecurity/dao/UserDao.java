package com.mahesh.ldapsecurity.dao;

import com.mahesh.ldapsecurity.dto.UserDto;
import com.mahesh.ldapsecurity.entity.UserEntity;

import java.util.List;

public interface UserDao {
    UserEntity saveUser(UserEntity userDto);
    void deleteUser(String userId);
    UserEntity updateUser(UserEntity userDto);
    List<UserEntity> getUsers();
}
