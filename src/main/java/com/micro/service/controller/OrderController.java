package com.micro.service.controller;

import com.micro.service.model.OrderDto;
import com.micro.service.services.OrderService;
import com.micro.service.services.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class OrderController {
    private OrderService userService;
    public OrderController(final OrderServiceImpl userService){
        this.userService=userService;
    }

    @GetMapping("/all")
    public List<OrderDto> getAllOrder(){
        return userService.getAllOrder();
    }

    @GetMapping("id")
    public OrderDto getOrderById(@RequestParam(name = "id") String id){
        return userService.getOrderById(id);
    }

    @PostMapping
    public OrderDto addOrder(@Validated @RequestBody OrderDto user){
        return userService.addOrder(user);
    }

    @PutMapping
    public OrderDto updateOrder(@Validated @RequestBody OrderDto user){
         return userService.updateOrder(user);
    }

    @DeleteMapping
    public boolean deleteOrder(@RequestParam(name= "id") String id){
        return  userService.deleteOrder(id);
    }

    @GetMapping("/validate")
    public boolean validateMapping(@RequestParam(name= "id") String id){
        return  userService.validateUser(id);
    }

}
