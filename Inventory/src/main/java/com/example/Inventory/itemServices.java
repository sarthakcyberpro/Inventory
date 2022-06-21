package com.example.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class itemServices{
    @Autowired
    private itemServices repository;



    public List<items> getAllitems() {
        return repository.getAllitems();
    }

    public items getfindById(int id) {
        return repository.getfindById(id);
    }




}
