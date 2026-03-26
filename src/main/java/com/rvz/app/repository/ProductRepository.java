package com.rvz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvz.app.entity.ProductDetails;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Long> {

}
