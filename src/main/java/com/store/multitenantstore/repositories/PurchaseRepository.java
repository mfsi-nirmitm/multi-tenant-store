package com.store.multitenantstore.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.store.multitenantstore.documents.Purchase;

@Repository
public interface PurchaseRepository extends MongoRepository<Purchase, String>{

}
