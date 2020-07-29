package com.study.repository;

import com.study.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}
