package com.main.projectrnsk.service;

import com.main.projectrnsk.models.Users;

import java.util.List;

public interface UsersService {
    public List<Users> getAllUsers();

    public  Users findUser(int id);

    public void saveUser(Users user);

    public  void deleteUser(Users user);
}
