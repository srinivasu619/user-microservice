package com.mgmt.users.dao;

import java.util.Optional;

import com.mgmt.users.models.User;

public interface UserRepository {
    public Optional<User> find(Long userId);
}