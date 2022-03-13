package com.store.multitenantstore.repositories;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.store.multitenantstore.documents.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{ '_id' : ?0 }")
    Optional<Product> findById(String id);
}
