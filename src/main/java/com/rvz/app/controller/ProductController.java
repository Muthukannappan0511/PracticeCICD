package com.rvz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rvz.app.entity.ProductDetails;
import com.rvz.app.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired 
	private ProductRepository productRepo;
	
	@GetMapping
	public List<ProductDetails> getData(){
		return productRepo.findAll();
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody ProductDetails product) {
	     productRepo.save(product);
	}

}
