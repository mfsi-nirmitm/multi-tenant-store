package com.store.multitenantstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.multitenantstore.documents.Product;
import com.store.multitenantstore.models.ProductSubmitRequest;
import com.store.multitenantstore.models.ProductSubmitResponse;
import com.store.multitenantstore.service.product.AbstractProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private AbstractProductService productService;

	@GetMapping
	public List<Product> findAllProduct() {
		return productService.getAllProducts();
	}
	
	@PostMapping("/submit")
	public ProductSubmitResponse submitProduct(@RequestBody ProductSubmitRequest request) {
		return productService.purchaseProduct(request);
	} 
}
