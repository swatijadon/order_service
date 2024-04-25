package com.micro.service.services;

import com.micro.service.model.OrderDto;

import java.util.List;
public abstract class OrderService {

    public abstract List<OrderDto> getAllOrder();

    public abstract OrderDto getOrderById(String id);

    public abstract OrderDto addOrder(OrderDto user);

    public abstract OrderDto updateOrder(OrderDto user);

    public abstract boolean deleteOrder(String id);

    public abstract boolean validateUser(String id);
}
