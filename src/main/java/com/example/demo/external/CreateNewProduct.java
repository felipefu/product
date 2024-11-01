package com.example.demo.external;

import com.example.demo.service.model.ProductDTO;

public class CreateNewProduct {

    public ProductDTO createNewProduct(ProductDTO productDTO) {
        return ProductDTO.builder()
            .name(productDTO.getName())
            .description(productDTO.getDescription())
            .price(productDTO.getPrice())
            .build();
    }
}
