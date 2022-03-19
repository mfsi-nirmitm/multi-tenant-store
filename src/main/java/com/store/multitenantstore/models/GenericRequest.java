package com.store.multitenantstore.models;

import java.util.Map;
import java.util.Set;

import com.store.multitenantstore.constants.FilterSearchKey;
import com.store.multitenantstore.constants.SortingOrder;

public class GenericRequest<T> {

	private T request;
	
	private Map<FilterSearchKey, Set<String>> searchMap;
	
	private String sortColumn;
	
	private SortingOrder sortingOrder = SortingOrder.ASC;
	
	private Pagination pagination;

	public T getRequest() {
		return request;
	}

	public void setRequest(T request) {
		this.request = request;
	}

	public Map<FilterSearchKey, Set<String>> getSearchMap() {
		return searchMap;
	}

	public void setSearchMap(Map<FilterSearchKey, Set<String>> searchMap) {
		this.searchMap = searchMap;
	}

	public String getSortColumn() {
		return sortColumn;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public SortingOrder getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(SortingOrder sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
}
