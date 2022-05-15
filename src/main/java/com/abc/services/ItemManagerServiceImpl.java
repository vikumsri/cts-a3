package com.abc.services;

import com.abc.Repository.ItemRepository;
import com.abc.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ItemManagerServiceImpl implements ItemManagerService{

    @Autowired
    public ItemRepository itemRepository;

    @Override
    public Map<String,Item> findAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item findItemById(String itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.insert(item);
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepository.update(item);
    }

    @Override
    public boolean deleteItem(String itemId) {
        return itemRepository.delete(itemId);
    }
}
