package com.saraprojects.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saraprojects.projectwebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
