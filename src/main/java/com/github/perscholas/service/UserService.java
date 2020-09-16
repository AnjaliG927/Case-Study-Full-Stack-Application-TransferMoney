package com.github.perscholas.service;

import com.github.perscholas.model.TransferAccount;
import com.github.perscholas.model.User;
import com.github.perscholas.repository.TransferAccountRepository;
import com.github.perscholas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;

@Service
public class UserService {

    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //
//    private TransferAccountRepository transferAccount;


    public User create(User user) {
       // user.setAccountSet(new HashSet<>(transferAccount.findAll()));
        return userRepository.save(user);
    }


    public User findById(Long id) {
    //TODO    return userRepository.findById(id).;
        return null;
    }

    public User updateById(Long id){
        //ToDO
        return null;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

