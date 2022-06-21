package com.example.Inventory;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class itemRepository {
    private List<items> list = new ArrayList<items>();

    public void createitems() {
        list = List.of(
                new items(1, "product 1", 10, 1000),
                new items(2, "product 2", 20, 2000),
                new items(3, "product 3", 30, 3000)
        );
    }

    public List<items> getAllitems() {
        return list;
    }

    public items findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }
}
