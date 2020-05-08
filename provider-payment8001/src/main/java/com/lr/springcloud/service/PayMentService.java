package com.lr.springcloud.service;

import com.lr.springcloud.entites.PayMent;

public interface PayMentService {

    public PayMent selectPayMent(Integer id);
    public int insertPayment(PayMent payMent);
}
