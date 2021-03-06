package com.store.multitenantstore.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

	@Id
    private String id;
	private String tenantId;
    private final String name;
    private final Double price;
    private final String imageUrl;
    
    public Product(String name,String tenantId, Double price, String imageUrl) {
        this.name = name;
        this.tenantId = tenantId;
        this.price = price;
        this.imageUrl = imageUrl;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
    
}
