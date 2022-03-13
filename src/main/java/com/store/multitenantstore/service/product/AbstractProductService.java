package com.store.multitenantstore.service.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.multitenantstore.documents.Product;
import com.store.multitenantstore.documents.Purchase;
import com.store.multitenantstore.models.ProductDto;
import com.store.multitenantstore.models.ProductSubmitRequest;
import com.store.multitenantstore.models.ProductSubmitResponse;
import com.store.multitenantstore.repositories.ProductRepository;
import com.store.multitenantstore.repositories.PurchaseRepository;

@Service
public class AbstractProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	PurchaseRepository purchaseRepository;

	
	public List<Product> getAllProducts(){
		List<Product> allProducts = productRepository.findAll();
		return allProducts;		
	} 
	
	public ProductSubmitResponse purchaseProduct(ProductSubmitRequest request) {
		ProductSubmitResponse response = new ProductSubmitResponse();
		System.out.println(request.getProductId());
		Product product = productRepository.findById(request.getProductId()).orElse(null);
		System.out.println(product.getId());
		if(Objects.isNull(product)) {
			response.setMessage("Invalid Product");
			return response;
		}
		Purchase purchase = new Purchase();
		purchase.setName(product.getName());
		purchase.setPrice(product.getPrice());
		purchase.setQuantity(request.getQuantity());
		purchase.setTotalPrice(request.getQuantity() * product.getPrice());
		purchase.setTenantId(request.getTenantId());
		purchaseRepository.save(purchase);
		response.setMessage("Successful");
		return response;
	} 
}
