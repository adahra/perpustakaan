/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.adahra.Perpustakaan.repository;

import io.github.adahra.Perpustakaan.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sebangsa
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
