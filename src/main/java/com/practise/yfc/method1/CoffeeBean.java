package com.practise.yfc.method1;

import lombok.Data;

@Data

public class CoffeeBean {
    private Long id;
    private String name;
    private String method;

    public static CoffeeBean createCoffee(){
        CoffeeBean coffee = new CoffeeBean();
        coffee.setId(1L);
        coffee.setName("拿铁");
        coffee.setMethod("静态方法装配");
        return coffee;
    }
    
}
