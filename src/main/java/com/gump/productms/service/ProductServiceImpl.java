package com.gump.productms.service;

import com.gump.productms.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;



    @Override
    public Optional<ProductDTO> create(ProductDTO request){
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setAvailable(request.isAvailable());

        repository.saveAndFlush(product);

        ProductDTO response = new ProductDTO();
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setAvailable(product.isAvailable());
        return Optional.of(request);
    }
}
