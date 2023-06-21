package com.shopproduct.controller;

import com.google.gson.Gson;
import com.shopproduct.entity.Coupon;
import com.shopproduct.service.HelloJsonService;
import com.shopproduct.util.HelloInstance;

public class HelloJsonController {
    HelloJsonService helloJsonService;
    public HelloJsonController(){
        helloJsonService= (HelloJsonService) HelloInstance.getInstance().getObject("HelloJsonService");
    }

    public String getAllCoupon() {
        String coupons_json=  helloJsonService.getAllCoupon();

        return coupons_json;
    }

    public void addCoupon(String coupon_json) {
        Gson gson=new Gson();
        Coupon coupon=gson.fromJson(coupon_json, Coupon.class);
        helloJsonService.addCoupon(coupon);

    }

    public void deleteCoupon(Integer coupon_id){
        helloJsonService.deleteCoupon(coupon_id);
    }

}
