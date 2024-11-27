package com.example.demo.external;

import com.example.demo.external.model.ProductExternal;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@CircuitBreaker(name = "productRepository", fallbackMethod = "fallbackCreateProduct")
@Retry(name = "productRepository")
public interface ProductRepository extends JpaRepository<ProductExternal, Long>{

}
