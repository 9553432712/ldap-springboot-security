package com.mahesh.ldapsecurity.dto;


/*
Author: Mahesh Punugupati
*/

import com.mahesh.ldapsecurity.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private int userId;
    private String userName;
    private String userDescription;
    public UserEntity toData(){
        UserEntity userEntity = new UserEntity(userId, userName, userDescription);
        return userEntity;
    }
}
