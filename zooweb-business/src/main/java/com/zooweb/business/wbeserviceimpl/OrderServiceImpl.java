package com.zooweb.business.wbeserviceimpl;

import com.zooweb.api.service.webservice.OrderService;

public class OrderServiceImpl implements OrderService{

    @Override
    public String OrderServiceTest(String str) {
        return "This is returned by web service:"+str;
    }
}
