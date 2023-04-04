package com.gump.productms.service;

import com.gump.productms.dto.ProductDTO;

import java.util.Optional;

public interface ProductService {
    Optional<ProductDTO> create(ProductDTO request);
}
