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
@RequestMapping("api/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> getProduct(){
        return ResponseEntity.ok("Product 1");
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getProductById(@PathVariable("id") int id){
        return ResponseEntity.ok("Product " + id);
    }

    @PostMapping
    public ResponseEntity<String> saveProduct(){
        return ResponseEntity.ok("Product Saved");
    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return ResponseEntity.status(HttpStatus.CREATED).body("Product Updated");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return ResponseEntity.status(HttpStatus.CREATED).body("Product Deleted");
    }
}
