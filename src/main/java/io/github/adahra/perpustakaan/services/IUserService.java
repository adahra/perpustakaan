package io.github.adahra.perpustakaan.services;

import io.github.adahra.perpustakaan.model.User;

/**
 * @author adnanto
 */
public interface IUserService {
    User getUserById(Integer id);

    Iterable<User> listAllUsers();
}
