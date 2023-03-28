package com.practise.yfc.method2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用xml装配
        ApplicationContext xmlApplicationContext = new AnnotationConfigApplicationContext(CoffeeConfiguration.class);
        // 构造方法
        CoffeeBean coffeeBeanByConstructor = xmlApplicationContext.getBean("coffeeBean", CoffeeBean.class);
        System.out.println(coffeeBeanByConstructor);
	}

}
