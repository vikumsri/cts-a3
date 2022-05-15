package com.abc.services.implementation;

import com.abc.models.Customer;
import com.abc.models.Item;
import com.abc.models.OrderModel;
import com.abc.repositories.OrderRepository;
import com.abc.services.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderModel> findAllOrderDetails() {
        return orderRepository.getAllOrders();

    }
    @Override
    public OrderModel getOrderById(int orderId){
        return orderRepository.getOrderById(orderId);
    }

    @Override
    public OrderModel addOrders(OrderModel orders) {
        return orderRepository.addOrderdetails(orders);
    }

    @Override
    public OrderModel updateOrders(int orderId, OrderModel orderModel) {
        return orderRepository.updateOrders(orderId,orderModel);
    }

    @Override
    public OrderModel deleteOrder(int orderId) {
        return orderRepository.deleteOrder(orderId);
    }
}
