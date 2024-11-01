package com.example.demo.external;

import com.example.demo.external.model.ProductExternal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductExternal, Long>{

}
