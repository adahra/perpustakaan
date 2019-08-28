package io.github.adahra.perpustakaan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.adahra.perpustakaan.model.User;
import io.github.adahra.perpustakaan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public ResponseEntity<Object> addNewUser(@RequestParam String name, @RequestParam String email) {
        ObjectNode objectNode = objectMapper.createObjectNode();
        User user = new User();
        if (name.isEmpty()) {
            objectNode.put("message", "Nama tidak boleh kosong");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        } else {
            user.setName(name);
        }

        if (email.isEmpty()) {
            objectNode.put("message", "Email tidak boleh kosong");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        } else {
            user.setEmail(email);
        }

        userRepository.save(user);

        objectNode.put("message", "Berhasil menambahkan user");
        return new ResponseEntity<>(objectNode, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteUserById(@PathVariable("id") String id) {
        int userId = Integer.parseInt(id);
        ObjectNode objectNode = objectMapper.createObjectNode();
        try {
            userRepository.deleteById(userId);
        } catch (EmptyResultDataAccessException erdae) {
            objectNode.put("message", "User tidak ditemukan");
            return new ResponseEntity<>(objectNode, HttpStatus.NOT_FOUND);
        } catch (IllegalArgumentException iae) {
            objectNode.put("message", "Parameter salah");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            objectNode.put("message", "Parameter tidak valid");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        }

        objectNode.put("message", "Berhasil menghapus user");
        return new ResponseEntity<>(objectNode, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllUsers() {
        ObjectNode objectNode = objectMapper.createObjectNode();
        Iterable<User> userFindAll = userRepository.findAll();
        return new ResponseEntity<>(userFindAll, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") String id) {
        ObjectNode objectNode = objectMapper.createObjectNode();
        int userId = 0;
        try {
            userId = Integer.parseInt(id);
        } catch (NumberFormatException nfe) {
            objectNode.put("message", "Parameter harus angka bukan string");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        } catch (IllegalArgumentException iae) {
            objectNode.put("message", "Parameter harus angka");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            objectNode.put("message", "Parameter tidak valid");
            return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        }

        final Optional<User> userById = userRepository.findById(userId);
        if (!userById.isPresent()) {
            objectNode.put("message", "User tidak ditemukan");
            return new ResponseEntity<>(objectNode, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userById, HttpStatus.OK);
    }
}
