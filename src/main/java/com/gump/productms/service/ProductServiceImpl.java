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

        //  Request -> Model/Entity -> Response
    }
}
