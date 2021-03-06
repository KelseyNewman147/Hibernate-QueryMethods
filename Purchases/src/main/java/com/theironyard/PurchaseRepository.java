package com.theironyard;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kelseynewman on 1/19/17.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer>{
    List<Purchase> findByCategory(String category);
}
