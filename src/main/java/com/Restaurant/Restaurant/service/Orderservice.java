package com.Restaurant.Restaurant.service;

import com.Restaurant.Restaurant.models.Orders;
import com.Restaurant.Restaurant.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Orderservice {
    @Autowired
    IOrderRepo iOrderRepo;
    public List<Orders> getAllOrder(){
        return iOrderRepo.findAll();
    }
    public String createOrder(Orders order){
        iOrderRepo.save(order);
        return "order succesfull";
    }
    public String cancelOrderById(Integer Id)
    {
        iOrderRepo.deleteById(Id);
        return "Order Cancel";
    }
}
