package com.example.orderfgin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import com.example.orderfgin.fallback.MemberFallBack;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "service-member",fallback= MemberFallBack.class)
public interface MemberFeign {
    @RequestMapping("/getToOrderMemberAll")
    public List<String> getToOrderMemberAll();
}
