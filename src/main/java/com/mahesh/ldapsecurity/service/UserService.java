package com.mahesh.ldapsecurity.service;


/*
Author: Mahesh Punugupati
*/


import com.mahesh.ldapsecurity.dto.UserDto;
import com.mahesh.ldapsecurity.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    void deleteUser(String userId);
    UserDto updateUser(UserDto userDto);
    List<UserEntity> getUsers();
}
