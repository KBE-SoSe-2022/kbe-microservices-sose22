package com.microservices.warehouse;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Product, Integer> {

}