package com.mgmt.users.dao;

import com.mgmt.users.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends JpaRepository<User, Long> {

}