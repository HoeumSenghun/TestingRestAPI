package com.restapi.testingrestapi;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String getProducts() {
        return "Laptop - Dell XPS 15";
    }
}
