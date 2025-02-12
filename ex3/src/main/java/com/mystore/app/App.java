package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {
        
       /* Product p1 = new Product();
        p1.setId(1);
        p1.setName("Tumbler");
        p1.setBarcode();
        System.out.println(p1);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Bucket");
        p2.setBarcode();        
        System.out.println(p2);*/
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean("product1",Product.class));
        System.out.println(context.getBean("product2",Product.class));
    }  
}