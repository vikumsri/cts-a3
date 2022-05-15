package com.abc.rest;

import com.abc.models.Item;
import com.abc.services.ItemManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ItemManagerRest {

        @Autowired
        ItemManagerService itemManagerService;

        @GetMapping("/")
        public String getHome(){
            return "This is Home page of ABC Online store";
        }

        @GetMapping("/items/all")
        public Map<String,Item> getAllItems(){
            return itemManagerService.findAllItems();
        }

        @GetMapping("/items/id/{itemId}")
        public Item getItemById(@PathVariable String itemId){
            return itemManagerService.findItemById(itemId);
        }

        @PostMapping("/items/add/")
        public Item addItem(@RequestBody Item item){
            return itemManagerService.addItem(item);
        }

        @PutMapping("/items/update/")
        public Item updateItem(@RequestBody Item item){
            return itemManagerService.updateItem(item);
        }

        @DeleteMapping("/items/delete/{itemId}")
        public boolean deleteItem(@PathVariable String itemId){
            return itemManagerService.deleteItem(itemId);
        }

}
