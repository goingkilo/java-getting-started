package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {


    @Autowired
    EntryRepository repository;


    @GetMapping
    public String get(){
        return "hello world";
    }
    @PutMapping
    public void put(){

    }
    @PostMapping
    public void post(){

    }
    @DeleteMapping
    public void delete(){

    }


}