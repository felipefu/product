package com.example.demo.service.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {

        private String name;
        private String description;
        private double price;
}
