package com.example.cloudservice.service;

import com.example.cloudservice.model.User;
import com.example.cloudservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String username, String password, String email) {
        // 检查用户名是否已存在
        if (userRepository.findByUsername(username) != null) {
            throw new RuntimeException("用户名已存在");
        }

        User user = new User(username, password, email);
        return userRepository.save(user);
    }

    public User loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("用户名不存在");
        }

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("密码错误");
        }

        return user;
    }
}