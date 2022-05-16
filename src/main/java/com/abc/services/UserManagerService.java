package com.abc.services;

import com.abc.models.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserManagerService {
    Map<String,User> findAllUsers();
    User findUserById(String userId);
    User addUser(User user);
    User updateUser(User user);
    boolean deleteUser(String userId);


}
