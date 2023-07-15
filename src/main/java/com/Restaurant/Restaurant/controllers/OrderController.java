package com.Restaurant.Restaurant.controllers;

import com.Restaurant.Restaurant.models.Orders;
import com.Restaurant.Restaurant.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    @Autowired
    Orderservice orderservice;
    @GetMapping("getAllOrders")
    public List<Orders> getAllOrders(){
        return orderservice.getAllOrder();
    }
    @DeleteMapping("cancelorder/{Id}")
    public String deleteById(@PathVariable Integer Id){
        return orderservice.cancelOrderById(Id);
    }
    @PostMapping("addOrder")
    public String addOrders(@RequestBody Orders order)
    {
        return orderservice.createOrder(order);
    }

}
