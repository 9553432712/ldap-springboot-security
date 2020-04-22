package com.mahesh.ldapsecurity.entity;


/*
Author: Mahesh Punugupati
*/

import com.mahesh.ldapsecurity.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor

@Table(name = "user_sample")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_description")
    private String userDescription;
    public UserDto toData(){
        UserDto userDto = new UserDto(userId, userName, userDescription);
        return userDto;
    }
    public UserEntity(){

    }
}
