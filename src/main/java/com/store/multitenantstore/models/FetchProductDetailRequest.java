package com.store.multitenantstore.models;

public class FetchProductDetailRequest {

	private String tenantId;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	
}
