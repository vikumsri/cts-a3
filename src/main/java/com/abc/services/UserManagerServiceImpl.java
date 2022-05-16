package com.abc.services;

import com.abc.models.User;
import com.abc.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public Map<String, User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User addUser(User user) {
        return userRepository.insert(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean deleteUser(String userId) {
        return userRepository.delete(userId);
    }
}
