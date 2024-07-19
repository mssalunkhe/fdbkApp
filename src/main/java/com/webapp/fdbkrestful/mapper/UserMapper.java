package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.UserDto;
import com.webapp.fdbkrestful.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user) {
        return UserDto.builder().userID(user.getUserID())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .address(user.getAddress())
                .mobile(user.getMobile())
                .dateOfBirth(user.getDateOfBirth())
                .build();
        //return new UserDto(  user.getUserID(), user.getAddress(), user.getName(), user.getEmail(), user.getMobile(), user.getDateOfBirth());//,user.getEmail(),user.getAddress(),user.getDateOfBirth(),user.getMobile());
        //return null;
    }

    public static User mapToUser(UserDto userDto) {
        return User.builder().userID(userDto.getUserID())
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .address(userDto.getAddress())
                .mobile(userDto.getMobile())
                .dateOfBirth(userDto.getDateOfBirth())
                .build();
        // return new User( userDto.getUserID(), userDto.getAddress(), userDto.getName(), userDto.getEmail(), userDto.getMobile(), userDto.getDateOfBirth());//,user.getEmail(),user.getAddress(),user.getDateOfBirth(),user.getMobile());
        //return null;
    }
}
