package com.example.demo.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {

    private String name;
    private String description;
    private double price;
}
