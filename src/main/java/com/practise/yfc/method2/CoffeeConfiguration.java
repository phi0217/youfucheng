package com.practise.yfc.method2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practise.yfc.method2.CoffeeBean")
public class CoffeeConfiguration {
	@Bean
    public CoffeeBean coffeeBean(){
		CoffeeBean coffee = new CoffeeBean();
		coffee.setId(1L);
        coffee.setName("拿铁");
        coffee.setMethod("Configuration装配");
        return coffee;
    }
}
