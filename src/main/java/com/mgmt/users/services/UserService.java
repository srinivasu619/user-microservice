package com.mgmt.users.services;

import com.mgmt.users.dto.UserResponseDto;

public interface UserService {
    public UserResponseDto findUser(Long userId);
}