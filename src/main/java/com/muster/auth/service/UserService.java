package com.muster.auth.service;

import com.muster.auth.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
