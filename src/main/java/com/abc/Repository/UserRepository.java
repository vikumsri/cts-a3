package com.abc.Repository;

import com.abc.models.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class UserRepository {

    Map<String, User> userDB = new HashMap<>();

    public User insert(User user){
        userDB.put(user.getUserId(), user);
        return user;
    }

    public User update(User user){
        userDB.replace(user.getUserId(), user);
        return user;
    }

    public Map<String,User> findAll(){
        return userDB;
    }

    public User findById(String id){
        return userDB.get(id);
    }

    public boolean delete(String id){
        try{
            userDB.remove(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
