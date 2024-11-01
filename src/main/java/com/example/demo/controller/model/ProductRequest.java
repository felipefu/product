package com.example.demo.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {

    public String name;
    public String description;
    public double price;

}
