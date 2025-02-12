package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")
public class AppConfig {
    @Bean
    public Product product1(Barcode barcode){
        Product p1 = new Product(barcode);
        p1.setId(1);
        p1.setName("Tumbler");
        p1.setBarcode();
        return  p1;
    }

    @Bean
    public Product product2(Barcode barcode){
        Product p2 = new Product(barcode);
        p2.setId(2);
        p2.setName("Bucket");
        p2.setBarcode();
        return p2;
    }

}
