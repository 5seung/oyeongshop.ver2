package com.amolli.oyeongshop.ver2.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/list")
    public String orderList(){
        return "/order/order-list";
    }
}
