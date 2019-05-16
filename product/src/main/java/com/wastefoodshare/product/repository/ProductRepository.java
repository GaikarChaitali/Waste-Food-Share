package com.wastefoodshare.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wastefoodshare.product.model.Product;

public interface ProductRepository extends MongoRepository<Product,String>{

}
