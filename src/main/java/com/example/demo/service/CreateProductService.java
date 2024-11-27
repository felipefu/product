package com.example.demo.service;

import com.example.demo.external.ProductRepository;
import com.example.demo.external.mapperExternalService.MappExternal;
import com.example.demo.external.model.ProductExternal;
import com.example.demo.service.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService {

    private final MappExternal mappExternal;
    private final ProductRepository productRepository;

    public CreateProductService(MappExternal mappExternal, ProductRepository productRepository) {
        this.mappExternal = mappExternal;
        this.productRepository = productRepository;
    }

    public ProductDTO createProduct(ProductDTO productDTO) {

        ProductExternal productExternal = mappExternal.mapProductDTOToProductExternal(productDTO);

        var product = productRepository.save(productExternal);

        return mappExternal.mapProductExternalToProductDTO(product);
    }

    public ProductDTO fallbackCreateProduct(ProductDTO productDTO, Throwable throwable) {
        // Lógica para lidar com a falha na criação do produto
        // Ex: Logar o erro, retornar um valor padrão, etc.
//        log.error("Erro ao criar produto", throwable);
        return null; // ou um ProductDTO com valores padrão
    }
}
