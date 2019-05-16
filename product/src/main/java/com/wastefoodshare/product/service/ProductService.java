package com.wastefoodshare.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wastefoodshare.product.model.Product;
import com.wastefoodshare.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	//post method
	public void addNewItem(Product product) {
		System.out.println(product + "saved in database");
		productRepository.save(product);
	}

	//get method
	public List<Product> getAllItems() {

		List<Product> items = new ArrayList<>();
		productRepository.findAll().forEach(items::add);
		return items;
	}

	//get by id 
	public Optional<Product> getItemById(String prodId) {
		System.out.println(prodId);
		return productRepository.findById(prodId);
	}

	//delete method
	public void deleteAllItems() {
		productRepository.deleteAll();
	}


	//delete by id
	public void deleteItemById(String prodId) {
		productRepository.deleteById(prodId);

	}


	//	public Optional<Product> getUserByName(String prodId) {
	//		System.out.println(prodId);
	//		Optional<Product> users = productRepository.getItemById(prodId);
	//		System.out.println(users);
	//		return users;
	//	}

}
