package com.truetech.demo.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.truetech.demo.rest.dao.ProductDAO;
import com.truetech.demo.rest.model.ProductModel;
import com.truetech.demo.rest.service.ProductService;

@RestController
@RequestMapping(path = "/api")
public class ProductDetailsController 
{
    @Autowired
    private ProductDAO productDAO;
    
    @GetMapping(path="/getproductdetails", produces = "application/json")
    public ProductService getProductDetails() 
    {
        return productDAO.getAllProducts();
    }
    
}
