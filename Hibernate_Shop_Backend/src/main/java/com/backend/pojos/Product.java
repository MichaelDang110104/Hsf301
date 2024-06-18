package com.backend.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductID")
	private int productID;
	
	@Column(name = "ProductCode")
	private String productCode;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Price")
	private double price;
	
	@Column(name = "Description")
	private String description;
	
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DiamondID")
	private Diamond diamondID;
	
	@Column(name = "LaborCost")
	private double laborCost;
	
	@Column(name = "Image")
	private String image;
	
	@Column(name = "MainDiamondQuantity")
	private int mainDiamondQuantity;
	
	@Column(name = "SubDiamondQuantity")
	private int subDiamondQuantity;
	
	@Column(name = "ShellAmount")
	private double shellAmount;
	
	@Column(name = "Status")
	private boolean status;
	
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CategoryID")
	private Category categoryID;
	
	// foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductID")
	Set<OrderDetail> orderDetailProduct = new HashSet<OrderDetail>();
	
	public Product() {
		this.productID = 0;
		this.productCode = "";
		this.name = "";
		this.price = 0.00;
		this.description = "";
		this.laborCost = 0.00;
		this.image = "";
		this.mainDiamondQuantity = 0;
		this.subDiamondQuantity = 0;
		this.shellAmount = 0;
		this.status = true;
	}
	public Product(int productID, String productCode, String name, double price, String description, double laborCost,
			String image, int mainDiamondQuantity, int subDiamondQuantity, double shellAmount, boolean status) {
		super();
		this.productID = productID;
		this.productCode = productCode;
		this.name = name;
		this.price = price;
		this.description = description;
		this.laborCost = laborCost;
		this.image = image;
		this.mainDiamondQuantity = mainDiamondQuantity;
		this.subDiamondQuantity = subDiamondQuantity;
		this.shellAmount = shellAmount;
		this.status = status;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Diamond getDiamondID() {
		return diamondID;
	}
	public void setDiamondID(Diamond diamondID) {
		this.diamondID = diamondID;
	}
	public double getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(double laborCost) {
		this.laborCost = laborCost;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getMainDiamondQuantity() {
		return mainDiamondQuantity;
	}
	public void setMainDiamondQuantity(int mainDiamondQuantity) {
		this.mainDiamondQuantity = mainDiamondQuantity;
	}
	public int getSubDiamondQuantity() {
		return subDiamondQuantity;
	}
	public void setSubDiamondQuantity(int subDiamondQuantity) {
		this.subDiamondQuantity = subDiamondQuantity;
	}
	public double getShellAmount() {
		return shellAmount;
	}
	public void setShellAmount(double shellAmount) {
		this.shellAmount = shellAmount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Category getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Category categoryID) {
		this.categoryID = categoryID;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productCode=" + productCode + ", name=" + name + ", price="
				+ price + ", description=" + description + ", diamondID=" + diamondID + ", laborCost=" + laborCost
				+ ", image=" + image + ", mainDiamondQuantity=" + mainDiamondQuantity + ", subDiamondQuantity="
				+ subDiamondQuantity + ", shellAmount=" + shellAmount + ", status=" + status + ", categoryID="
				+ categoryID + "]";
	}
	
	
}
