package com.github.perscholas.service;


import com.github.perscholas.model.User;
import com.github.perscholas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User findByUsername(String username) {
        List<User> userList = findAllUsers();
        User user = userList.stream()
                .filter(user1 -> (user1.getUsername().equals(username)))
                .findAny()
                .orElse(null);
        return user;
    }

    public List<User> findAllUsers() {
        Iterable<User> UserIterable = userRepository.findAll();
        List<User> userList = new ArrayList<>();
        UserIterable.forEach(userList::add);
        return userList;

    }

    public User readById(Long id) {
        return userRepository.findById(id).get();
    }

    public User updateById(Long id, User updatedData) {
        User userInDb = readById(id);
        userInDb.setFirstName(updatedData.getFirstName());
        userInDb.setLastName(updatedData.getLastName());
        userInDb.setEmail(updatedData.getEmail());

        userInDb = userRepository.save(userInDb);
        return userInDb;
    }

    public User deleteById(Long id) {
        User UserToBeDeleted = readById(id);
        userRepository.delete(UserToBeDeleted);
        return UserToBeDeleted;
    }

    public User updatePassword(Long id, String password) {
        User UserInDatabase = readById(id);
        UserInDatabase.setPassword(password);
        return updateById(id, UserInDatabase);
    }

    @CacheEvict(allEntries = true)
    public void create(User user) {
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }

    public Boolean validateUser(String username, String password) {
        User user = findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }


}

