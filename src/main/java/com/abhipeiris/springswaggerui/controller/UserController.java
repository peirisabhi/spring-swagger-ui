package com.abhipeiris.springswaggerui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 23/06/2023
 * Time: 11:46
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("User 1");
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getUserById(@PathVariable("id") int id){
        return ResponseEntity.ok("User " + id);
    }

    @PostMapping
    public ResponseEntity<String> saveUser(){
        return ResponseEntity.ok("User Saved");
    }

    @PutMapping
    public ResponseEntity<String> updateUser(){
        return ResponseEntity.status(HttpStatus.CREATED).body("User Updated");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(){
        return ResponseEntity.status(HttpStatus.CREATED).body("User Deleted");
    }
}
