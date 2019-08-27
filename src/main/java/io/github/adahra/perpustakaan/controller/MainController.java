 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package io.github.adahra.Perpustakaan.controller;

 import com.fasterxml.jackson.databind.ObjectMapper;
 import com.fasterxml.jackson.databind.node.ObjectNode;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 /**
  * @author sebangsa
  */
 @RestController    // This means that this class is a Controller
 public class MainController {
     @Autowired
     private ObjectMapper objectMapper;

     @RequestMapping("/")
     public ResponseEntity<Object> getIndex() {
         ObjectNode objectNode = objectMapper.createObjectNode();
         objectNode.put("message", "Homepage");
         return new ResponseEntity<>(objectNode, HttpStatus.OK);
     }
 }