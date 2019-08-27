package io.github.adahra.Perpustakaan.services;

import io.github.adahra.Perpustakaan.model.User;

/**
 * @author adnanto
 */
public interface IUserService {
    User getUserById(Integer id);

    Iterable<User> listAllUsers();
}
