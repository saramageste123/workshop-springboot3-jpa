package com.saraprojects.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saraprojects.projectwebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
