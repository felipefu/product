package com.example.demo.external.mapperExternalService;

import com.example.demo.external.model.ProductExternal;
import com.example.demo.service.model.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class MappExternal {

    public ProductDTO mapProductExternalToProductDTO(ProductExternal productExternal) {
        return ProductDTO.builder()
            .name(productExternal.getName())
            .description(productExternal.getDescription())
            .price(productExternal.getPrice())
            .build();
    }

    public ProductExternal mapProductDTOToProductExternal(ProductDTO productDTO) {
        return ProductExternal.builder()
            .name(productDTO.getName())
            .description(productDTO.getDescription())
            .price(productDTO.getPrice())
            .build();
    }
}
