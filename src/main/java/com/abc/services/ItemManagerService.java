package com.abc.services;

import com.abc.models.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public interface ItemManagerService {

    Map<String,Item> findAllItems();
    Item findItemById(String itemId);
    Item addItem(Item item);
    Item updateItem(Item item);
    boolean deleteItem(String itemId);
}
