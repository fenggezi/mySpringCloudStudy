package com.lr.springcloud.service.impl;

import com.lr.springcloud.dao.PayMentDao;
import com.lr.springcloud.entites.PayMent;
import com.lr.springcloud.service.PayMentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PayMentServiceImpl implements PayMentService {

    @Resource
    PayMentDao payMentDao;
    @Override
    public PayMent selectPayMent(Integer id) {
        return payMentDao.getPaymentById(id);
    }

    @Override
    public int insertPayment(PayMent payMent) {
        return payMentDao.create(payMent);
    }
}
