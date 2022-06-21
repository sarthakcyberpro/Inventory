package com.example.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class itemControllers {

    @Autowired
    private itemServices service;


    @GetMapping
    public List<items> getAllitems() {
        return service.getAllitems();
    }

    @GetMapping("{id}")
    public items findById(@PathVariable int id) {
        return service.getfindById(id);
    }


}