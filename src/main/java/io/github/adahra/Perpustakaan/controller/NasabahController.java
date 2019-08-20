/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.adahra.Perpustakaan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.adahra.Perpustakaan.model.Nasabah;
import io.github.adahra.Perpustakaan.repository.NasabahRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sebangsa
 */
@RestController
@RequestMapping(path = "/nasabah")
public class NasabahController {
    @Autowired
    private NasabahRepository nasabahRepository;
    @Autowired
    private ObjectMapper objectMapper;
    
    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Nasabah> getAllNasabah() {
        return nasabahRepository.findAll();
    }
    
    @GetMapping(path = "/count")
    public @ResponseBody
    ObjectNode getCountNasabah() {
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("count_nasabah", nasabahRepository.count());
        return objectNode;
    }
    
    @GetMapping(path = "/{id}")
    public List<Nasabah> read(@PathVariable("id") String id) {
        return nasabahRepository.findByNasabahId(id);
    }
}
