package com.ifeng.speedkill.service;

import com.ifeng.speedkill.dao.UserMapper;
import com.ifeng.speedkill.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserMapper mappers;

    public User getById(int id){
       return mappers.getById(id);
    }
    @Transactional
    public boolean tx(){
        User user1 = new User();
        user1.setId(2);
        user1.setUsername("lulu");
        mappers.insert(user1);
        User user2 = new User();
        user1.setId(1);
        user1.setUsername("lulu");
        mappers.insert(user2);
        return true;
    }

}
