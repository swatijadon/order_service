package com.micro.service.services;

import com.micro.service.model.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class OrderServiceImpl extends OrderService {
    List<OrderDto> order;

    public OrderServiceImpl() {
        OrderDto order1 = new OrderDto("iogusnf", "swati", "ejb","reaoi");
        OrderDto order2 = new OrderDto("1", "j", "sre", "are");
        order = new ArrayList<>(Arrays.asList(order1, order2));

    }

    @Override
    public List<OrderDto> getAllOrder() {
        return order;
    }

    @Override
    public OrderDto getOrderById(String id) {
     Optional<OrderDto> ordera =   order.stream().filter(u -> u.getOrderId()== id).findFirst();
        return ordera.isPresent() ? ordera.get() : null;
    }

    @Override
    public OrderDto addOrder(OrderDto order) {
        return null;
    }

    @Override
    public OrderDto updateOrder(OrderDto order) {
        return null;
    }

    @Override
    public boolean deleteOrder(String id) {
        return false;
    }

    @Override
    public boolean validateUser(String id) {
        return false;
    }
}
