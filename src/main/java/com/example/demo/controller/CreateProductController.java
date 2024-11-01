package com.example.demo.controller;

import com.example.demo.controller.model.ProductRequest;
import com.example.demo.controller.model.ProductResponse;
import com.example.demo.controller.mapperControllerService.MapperProduct;
import com.example.demo.service.CreateProductService;
import com.example.demo.service.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CreateProductController {

    private final MapperProduct mapperProduct;
    private final CreateProductService createProductService;

    public CreateProductController(CreateProductService createProductService, MapperProduct mapperProduct) {
        this.createProductService = createProductService;
        this.mapperProduct = mapperProduct;
    }

    @PostMapping("/products")
    // Devo retornar o produto ?
    public ResponseEntity<ProductResponse> newProduct(@RequestBody ProductRequest productRequest) {

        ProductDTO productDTO = mapperProduct.mapProductRequestToProductDTO(productRequest);

        ProductDTO pro =  createProductService.createProduct(productDTO);

        ProductResponse productResponse = mapperProduct.mapProductDTOToProductResponse(pro);

        return ResponseEntity.ok(productResponse);
    }
}
