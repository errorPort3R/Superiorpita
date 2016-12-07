package com.nataandporterinc.services;

import com.nataandporterinc.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 12/7/16.
 */
public interface ProductRepository extends CrudRepository<Product, Integer>
{
}
