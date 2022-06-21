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

    public List<items> search(String name) {
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

    public items save(items p) {
        items item = new items();
        item.setId(p.getId());
        item.setName(p.getName());
        item.setQuantity(p.getQuantity());
        item.setPrice(p.getPrice());
        list.add(item);
        return item;
    }

    public String delete(Integer id) {
        list.removeIf(x -> x.getId() == (id));
        return null;
    }

    public items update(items item) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (item.getId())) {
                id = item.getId();
                idx = i;
                break;
            }
        }

        items item1 = new items();
        item1.setId(id);
        item1.setName(item.getName());
        item1.setQuantity(item.getQuantity());
        item1.setPrice(item.getPrice());
        list.set(idx, item);
        return item1;
    }
}
