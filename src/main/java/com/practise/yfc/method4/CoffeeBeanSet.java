package com.practise.yfc.method4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeBeanSet {
	private CoffeeBean coffeeBeanSet;
	 
    @Autowired
    public CoffeeBeanSet(CoffeeBean coffeeBeanSet){
        this.coffeeBeanSet = coffeeBeanSet;
        this.coffeeBeanSet.setMethod("set方法注入");
    }

    @Override
    public String toString() {
        return "CoffeeBeanSet{" + "coffeeBeanSet=" + coffeeBeanSet.getMethod() + '}';
    }

}
