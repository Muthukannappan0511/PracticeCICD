package com.rvz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvz.app.entity.SupplierDetails;

@Repository 
public interface SupplierRepository extends JpaRepository<SupplierDetails,Long> {
       
}
