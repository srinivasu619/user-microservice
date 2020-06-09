package com.mgmt.users.services.impl;

import java.util.Optional;

import com.mgmt.users.dao.UserRepository;
import com.mgmt.users.dto.UserResponseDto;
import com.mgmt.users.models.User;
import com.mgmt.users.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDto findUser(Long userId) {
        Optional<User> user = userRepository.find(userId);
        if (user.isPresent()) {
            return new UserResponseDto(user.get());
        }
        return null;
    }

}