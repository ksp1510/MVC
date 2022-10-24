package com.gmh.MVC.service;


import com.gmh.MVC.model.Products;
import com.gmh.MVC.model.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Products> getProducts() {
        List<Products> products = new ArrayList<>();
        Products products1 = new Products(1, "Rainbow Ice-Cream", "https://tinyurl.com/mrm8fyfd","15.00","Rainbow colored ice cream with various flavours.");
        Products products2 = new Products(2, "Blueberry Ice-Cream", "https://tinyurl.com/2n84kph8","12.00","Blueberry flavoured ice cream.");
        products.add(products1);
        products.add(products2);
        return products;
    }

    public List<Products> searchProducts(String name) {
        List<Products> products = new ArrayList<>();
        Products products1 = new Products(1, name, "https://tinyurl.com/mrm8fyfd","15.00","Rainbow colored ice cream with various flavours.");
        products.add(products1);
        return products;
    }

    public List<Query> getQuery(String name, String email, String sub, String msg) {
        List<Query> query = new ArrayList<>();
        Query q = new Query();
        System.out.println("Model class");
        q.setName(name);
        System.out.println(name);
        q.setEmail(email);
        System.out.println(email);
        q.setSubject(sub);
        System.out.println(sub);
        q.setMsg(msg);
        System.out.println(msg);
        query.add(q);
        return query;
    }

}
