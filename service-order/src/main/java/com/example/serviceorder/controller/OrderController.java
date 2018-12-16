package com.example.serviceorder.controller;

import com.example.serviceorder.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMemberService orderMemberService;


    @RequestMapping("/getOrderUserAll")
    public List<String> getOrderUserAll(){
        System.out.println("订单服务调用会员服务");
        return orderMemberService.getOrderUserAll();
    }

    @RequestMapping("/getOrderServiceApi")
    public String getOrderServiceApi(){
        return "this is order project";
    }

}
