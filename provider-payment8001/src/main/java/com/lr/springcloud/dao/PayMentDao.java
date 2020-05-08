package com.lr.springcloud.dao;

import com.lr.springcloud.entites.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayMentDao {

    public int create(PayMent payMent);

    public PayMent getPaymentById(@Param("id") Integer id);
}
