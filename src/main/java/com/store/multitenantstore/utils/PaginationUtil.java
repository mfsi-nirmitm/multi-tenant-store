package com.store.multitenantstore.utils;

import java.util.Objects;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.store.multitenantstore.models.Pagination;

@Component
public class PaginationUtil {

	public Pageable getPaginationObject(Pagination pagination) {
		if(Objects.isNull(pagination)) {
			return PageRequest.of(0, 10);
		} else {
			return PageRequest.of(pagination.getPageNo(),pagination.getPageSize());
		}
	}
	
}
