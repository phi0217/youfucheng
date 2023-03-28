package com.practise.yfc.method3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practise.yfc.method3.CoffeeBean;

@Component
public class CoffeeBeanConstructor {
	private CoffeeBean coffeeBeanConstructor;
	 
    @Autowired
    public CoffeeBeanConstructor(CoffeeBean coffeeBeanConstructor){
        this.coffeeBeanConstructor = coffeeBeanConstructor;
        this.coffeeBeanConstructor.setMethod("Constructor装配");
    }

    @Override
    public String toString() {
        return "CoffeeBean{" + "coffeeBeanConstructor=" + coffeeBeanConstructor.getMethod() + '}';
    }
    
}
