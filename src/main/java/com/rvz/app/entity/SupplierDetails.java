package com.rvz.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SupplierDetails {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
     private String name;
     private String address;
     private String phoneNO;
     private String productName;
	 public long getId() {
		 return id;
	 }
	 public void setId(long id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public String getPhoneNO() {
		 return phoneNO;
	 }
	 public void setPhoneNO(String phoneNO) {
		 this.phoneNO = phoneNO;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public void setProductName(String productName) {
		 this.productName = productName;
	 }
   
}
