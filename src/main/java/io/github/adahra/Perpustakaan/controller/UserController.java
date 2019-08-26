package io.github.adahra.Perpustakaan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.adahra.Perpustakaan.model.User;
import io.github.adahra.Perpustakaan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public ResponseEntity<Object> addNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("message", "Berhasil menambahkan user");
        return new ResponseEntity<>(objectNode, HttpStatus.OK);
    }

    @GetMapping(path = "/all")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getUserById(@PathVariable("id") String id) {
        return userRepository.findById(Integer.valueOf(id));
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Object> deleteUserById(@PathVariable("id") String id) {
        userRepository.deleteById(Integer.valueOf(id));
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("message", "Berhasil menghapus user");
        return new ResponseEntity<>(objectNode, HttpStatus.OK);
    }
}
