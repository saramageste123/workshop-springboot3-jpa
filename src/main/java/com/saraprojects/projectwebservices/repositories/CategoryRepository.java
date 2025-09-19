package com.saraprojects.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saraprojects.projectwebservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
