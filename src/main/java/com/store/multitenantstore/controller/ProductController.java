package com.store.multitenantstore.controller;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.multitenantstore.documents.Product;
import com.store.multitenantstore.models.FetchProductDetailRequest;
import com.store.multitenantstore.models.GenericRequest;
import com.store.multitenantstore.models.ProductSubmitRequest;
import com.store.multitenantstore.models.ProductSubmitResponse;
import com.store.multitenantstore.service.product.AbstractProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private AbstractProductService productService;

	@PostMapping
	public Page<Product> findAllProduct(@RequestBody GenericRequest<FetchProductDetailRequest> genericRequest) {
		return productService.getAllProducts(genericRequest);
	}
	
	@PostMapping("/submit")
	public ProductSubmitResponse submitProduct(@RequestBody ProductSubmitRequest request) {
		return productService.purchaseProduct(request);
	} 
}
