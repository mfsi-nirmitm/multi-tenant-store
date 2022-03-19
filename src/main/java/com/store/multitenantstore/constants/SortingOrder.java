package com.store.multitenantstore.constants;

public enum SortingOrder {

	ASC("asc"),
	DESC("desc");
	
	private String orderValue;
	
	SortingOrder(String orderValue) {
		this.orderValue = orderValue;
	}
	
	public String getOrderValue() {
		return orderValue;
	} 
}
