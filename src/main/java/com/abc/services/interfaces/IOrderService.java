package com.abc.services.interfaces;

import com.abc.models.OrderModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {
    List<OrderModel> findAllOrderDetails();
    OrderModel getOrderById(int orderId);

    OrderModel addOrders(OrderModel orders);

    OrderModel updateOrders(int orderId, OrderModel orderModel);

    OrderModel deleteOrder(int orderId);
}
