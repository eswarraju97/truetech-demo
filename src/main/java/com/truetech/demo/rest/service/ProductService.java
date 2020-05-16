package com.truetech.demo.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.truetech.demo.rest.model.ProductModel;
@Service
public class ProductService 
{
    private List<ProductModel> productservice;
    
    public List<ProductModel> getproductservice() {
        if(productservice == null) {
        	productservice = new ArrayList<>();
        }
        return productservice;
    }
 
    
}
