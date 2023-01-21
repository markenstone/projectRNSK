package com.main.projectrnsk.service;

import com.main.projectrnsk.models.Users;
import com.main.projectrnsk.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public List<Users> getAllUsers() {

        return usersRepository.findAll();
    }

    @Override
    public Users findUser(int id) {
        return usersRepository.getById(id);
    }

    @Override
    public void saveUser(Users user) {
        usersRepository.save(user);
    }

    @Override
    public void deleteUser(Users user){
        usersRepository.delete(user);
    }
}
