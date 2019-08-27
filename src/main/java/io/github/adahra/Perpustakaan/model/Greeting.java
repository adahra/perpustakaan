/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.adahra.Perpustakaan.model;

/**
 * @author sebangsa
 */
public class Greeting {
    private final String content;
    private final long id;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
