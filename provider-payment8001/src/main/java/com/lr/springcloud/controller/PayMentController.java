package com.lr.springcloud.controller;

import com.lr.springcloud.entites.CommonResult;
import com.lr.springcloud.entites.PayMent;
import com.lr.springcloud.service.PayMentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PayMentController {

    @Resource
    PayMentService payMentService;
    @GetMapping("/select/payment/{id}")
    public CommonResult<PayMent> selectPayment(Integer id){
        PayMent payMent = payMentService.selectPayMent(id);

        if(payMent!=null){
            return new CommonResult(200,"",payMent);
        }else{
            return new CommonResult(444,"",null);
        }
    }

}
