package com.truetech.demo.rest.dao;

import org.springframework.stereotype.Repository;

import com.truetech.demo.rest.model.ProductModel;
import com.truetech.demo.rest.service.ProductService;

@Repository
public class ProductDAO 
{
	 private static ProductService list = new ProductService();
    
    static 
    {
        list.getproductservice().add(new ProductModel(1, "Eswarraju", "5"));
        list.getproductservice().add(new ProductModel(2, "java", "8"));
        list.getproductservice().add(new ProductModel(3, "eswar", "9"));
    }
    
    public ProductService getAllProducts() 
    {
        return list;
    }
    
}
