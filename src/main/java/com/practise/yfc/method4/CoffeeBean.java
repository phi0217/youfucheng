package com.practise.yfc.method4;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value="coffeeBean")
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
