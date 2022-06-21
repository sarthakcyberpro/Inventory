package com.example.Inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class items {
    private int id;
    private String name;
    private int quantity;
    private double price;
}