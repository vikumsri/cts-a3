package com.abc.Repository;

import com.abc.models.Customer;
import com.abc.models.Item;
import com.abc.models.OrderModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {

    private static Map<Integer, OrderModel> orderDetails= new HashMap<>();

    private static int index= 2;

    static {

        Item item1= new Item(1,"Soap","Sunlight",100);
        Item item2 = new Item(2,"Shampoo","Jeval",4000);

        Customer customer1=new Customer(1,"Sanduni","Moratuwa","0716743562","9878653462");
        Customer customer2=new Customer(1,"Vikum","Malabe","0766743562","9918653462");

        OrderModel order1 = new OrderModel(1,item1,customer1,"Pending");
        OrderModel order2 = new OrderModel(2,item2,customer2,"Done");
        OrderModel order3 = new OrderModel(2,item2,customer1,"Done");

        orderDetails.put(1,order1);
        orderDetails.put(2,order2);

    }
    public List<OrderModel> getAllOrders(){
        return new ArrayList<>(orderDetails.values());
    }

    public OrderModel getOrderById(int id){
        return orderDetails.get(id);
    }
    public OrderModel addOrderdetails(OrderModel order){
        index =3;
        order.setOrderId(index);
        orderDetails.put(index,order);
        return order;
    }
    public  OrderModel updateOrders(int orderId,OrderModel order){
        order.setOrderId(orderId);
        orderDetails.put(orderId,order);
        return order;
    }
    public OrderModel deleteOrder(int orderId){
        return orderDetails.remove(orderId);
    }


}
