package org.senai.prjjava.repository;

import org.senai.prjjava.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    
}
