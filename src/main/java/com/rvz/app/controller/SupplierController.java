package com.rvz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rvz.app.entity.SupplierDetails;
import com.rvz.app.repository.SupplierRepository;

@CrossOrigin( origins="http://localhost:5173")
@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
	
	  @Autowired
	  private SupplierRepository supplierRepo;
	  
      @GetMapping
      public List<SupplierDetails> getDetails(){
         return supplierRepo.findAll();
      }
}
