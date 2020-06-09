package com.mgmt.users.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;

import com.mgmt.users.dao.UserRepository;
import com.mgmt.users.models.User;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users;

    public UserRepositoryImpl() {
        LongStream.range(1, 3).forEach(userId -> {
            User user = new User();
            user.setUserId(userId);
            user.setAge(23);
            user.setName("John Doe" + userId);
            user.setEmail("john.doe@gmail.com");
            this.users.add(user);
        });
    }

    @Override
    public Optional<User> find(Long userId) {
        return users.stream().filter(user -> user.getUserId().equals(userId)).findFirst();
    }

}