package com.test.lokesh.context;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, String> context = new HashMap<String, String>();


    private String orderDate;

    public String getOrderDate (){
        System.out.println("getOrderDate"+orderDate);
        return orderDate;
    }

    public void setOrderDate (String orderDate){

        this.orderDate = orderDate;
        System.out.println("setOrderDate"+this.orderDate);
    }

    public void setContextParam(String key, String value) {
         context.put(key, value);
    }

    public String getContextParam(String key) {
        return context.get(key);
    }

}
