package com.abc.Repository;

import com.abc.models.Item;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemRepository {

    Map<String, Item> itemDB = new HashMap<>();

    public Item insert(Item item){
        itemDB.put(item.getItemId(), item);
        return item;
    }

    public Item update(Item item){
        itemDB.replace(item.getItemId(), item);
        return item;
    }

    public Map<String,Item> findAll(){
        return itemDB;
    }

    public Item findById(String id){
        return itemDB.get(id);
    }

    public boolean delete(String id){
        try{
            itemDB.remove(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
