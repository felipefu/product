package com.example.demo.controller.mapperControllerService;

import com.example.demo.controller.model.ProductRequest;
import com.example.demo.controller.model.ProductResponse;
import com.example.demo.service.model.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class MapperProduct {

    public ProductDTO mapProductRequestToProductDTO(ProductRequest productRequest) {
        return ProductDTO.builder()
            .name(productRequest.getName())
            .description(productRequest.getDescription())
            .price(productRequest.getPrice())
            .build();
    }

    public ProductResponse mapProductDTOToProductResponse(ProductDTO productDTO) {
        return ProductResponse.builder()
            .name(productDTO.getName())
            .description(productDTO.getDescription())
            .price(productDTO.getPrice())
            .build();
    }
}
