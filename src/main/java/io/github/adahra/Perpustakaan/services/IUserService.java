package io.github.adahra.Perpustakaan.services;

import io.github.adahra.Perpustakaan.model.User;

public interface IUserService {
    Iterable<User> listAllUsers();

    User getUserById(Integer id);
}
