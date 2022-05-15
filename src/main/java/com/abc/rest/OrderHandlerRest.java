package com.abc.rest;

import com.abc.models.Customer;
import com.abc.models.Item;
import com.abc.models.OrderModel;
import com.abc.services.implementation.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderHandlerRest {
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String getHome(){
        return "This is Home page of ABC Online store";
    }
    @GetMapping("/orders/all")
    public List<OrderModel> getAllOrderDetails(){
      return orderService.findAllOrderDetails();
    }

    @GetMapping("/orders/{orderId}")
    public OrderModel getOrderById(@PathVariable int orderId){
        return orderService.getOrderById(orderId);
    }

    @PostMapping("/orders/add-orders")
    public OrderModel addOrders(@RequestBody OrderModel orderModel){
        return orderService.addOrders(orderModel);
    }

    @PutMapping("/orders/update-order/{orderId}")
    public OrderModel updateOrders(@PathVariable int orderId,@RequestBody OrderModel orderModel){
        return  orderService.updateOrders(orderId,orderModel);
    }

    @DeleteMapping("orders/delete-order/{orderId}")
    public OrderModel deleteOrder(@PathVariable int orderId){
        return orderService.deleteOrder(orderId);
    }


}
