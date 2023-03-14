package com.lcwd.userservice.service;

import java.util.List;

import com.lcwd.userservice.entity.User;

public interface UserService
{

    User saveUser(User user);

    List<User> getAlllUser();

    User getUserById(String id);

    User updateUser(User user,String id);

    void deleteUser(String id);



}

