package com.wastefoodshare.product.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.wastefoodshare.product.model.Product;
import com.wastefoodshare.product.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="http://localhost:4008")
@RestController
@RequestMapping("/foodshare")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getallitems")
	public List<Product> getAllItems() {
		System.out.println("Get all Items...");
		return productService.getAllItems();
	}

	@PostMapping("/items/add")
	public Product addNewItem(@RequestBody Product product) {
		System.out.println(product);
		productService.addNewItem(product);

		return product;	
	}


	@GetMapping("/items/{prodId}")
	public Optional<Product> getItemById(@PathVariable String prodId) {
		System.out.println("Get sprcific User by email...");
		return productService.getItemById(prodId);
	}
	@DeleteMapping("/items/delete")
	public void deleteAllItems() {
		System.out.println("Delete All Users...");

		productService.deleteAllItems();
	}

	@DeleteMapping("/items/delete/{prodId}")
	public void deleteItemById(@PathVariable("prodId") String prodId) {
		System.out.println("Delete specific Items...");

		productService.deleteItemById(prodId);
	}
	//
	//    @PutMapping("/items/update/{prodId}")
	//	public void updateItem(@RequestBody Product product, @PathVariable String prodId ) {
	//		System.out.println(prodId);
	//		
	//		product.setProdId(prodId);
	//		
	//		productService.addNewItem(product);
	////		Optional<Product>
	//       
	////		Optional<Product> item = productService.getItemById(prodId);
	////		System.out.println(item);
	////		return item;
	//		
	//		
	//
	//
	//
	//	}


}
