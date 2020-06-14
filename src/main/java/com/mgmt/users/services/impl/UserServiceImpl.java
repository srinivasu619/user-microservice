package com.mgmt.users.services.impl;

import java.util.Optional;

import com.mgmt.users.dao.UserRepositoryJPA;
import com.mgmt.users.dto.UserResponseDto;
import com.mgmt.users.models.User;
import com.mgmt.users.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositoryJPA userRepository;

    @Override
    public UserResponseDto findUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return new UserResponseDto(user.get());
        }
        return null;
    }

}