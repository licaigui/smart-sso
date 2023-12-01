package com.smart.userCenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.userCenter.entity.User;
import com.smart.userCenter.repository.UserRepository;

/**
 * 功能描述
 *
 * @since 2023-11-27
 */
@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
