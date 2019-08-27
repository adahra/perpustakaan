package io.github.adahra.perpustakaan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.adahra.perpustakaan.model.User;
import io.github.adahra.perpustakaan.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/add")
    public ResponseEntity<Object> addNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("message", "Berhasil menambahkan user");
        return new ResponseEntity<>(objectNode, HttpStatus.OK);
    }

    @DeleteMapping("/user/delete/{id}")
    public ResponseEntity<Object> deleteUserById(@PathVariable("id") String id) {
        int userId = Integer.parseInt(id);
        ObjectNode objectNode = objectMapper.createObjectNode();
        try {
            userRepository.deleteById(userId);
        } catch (EmptyResultDataAccessException erdae) {
            objectNode.put("message", "User tidak ditemukan");
        }

        objectNode.put("message", "Berhasil menghapus user");
        return new ResponseEntity<>(objectNode, HttpStatus.OK);
    }

    @GetMapping("/user/all")
    public Iterable<User> getAllUsers() {
        ObjectNode objectNode = objectMapper.createObjectNode();
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") String id) {
        ObjectNode objectNode = objectMapper.createObjectNode();
        int userId = 0;
        try {
            userId = Integer.parseInt(id);
        } catch (NumberFormatException nfe) {
            objectNode.put("message", "Parameter harus angka bukan string");
        }

        return userRepository.findById(userId);
    }
}
