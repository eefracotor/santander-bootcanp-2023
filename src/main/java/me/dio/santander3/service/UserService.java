package me.dio.santander3.service;

import me.dio.santander3.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}