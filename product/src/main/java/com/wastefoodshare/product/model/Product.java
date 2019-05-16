package com.wastefoodshare.product.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "foodItems")
public class Product {

	@Id
	String prodId;
	String prodName;
	String prodDetails;
	Date uploadedDate;
	String prodImage;
	String prodcategory;
	
	
	public Product() {
		
	}
	
	public Product(String prodId, String prodName, String prodDetails, Date uploadedDate, String prodImage, String prodcategory) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDetails = prodDetails;
		this.uploadedDate = uploadedDate;
		this.prodImage = prodImage;
		this.prodcategory = prodcategory;
	}

	public String getProdcategory() {
		return prodcategory;
	}

	public void setProdcategory(String prodcategory) {
		this.prodcategory = prodcategory;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDetails() {
		return prodDetails;
	}

	public void setProdDetails(String prodDetails) {
		this.prodDetails = prodDetails;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public String getProdImage() {
		return prodImage;
	}

	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodDetails=" + prodDetails
				+ ", uploadedDate=" + uploadedDate + ", prodImage=" + prodImage + ", prodcategory=" + prodcategory
				+ "]";
	}

	
	
	
	
	
	
}
