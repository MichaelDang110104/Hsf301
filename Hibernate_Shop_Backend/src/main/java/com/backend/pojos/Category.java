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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.backend.pojos.Size;

@Entity
@Table(name = "CATEGORY")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryID")
	private int categoryID;
	
	@Column(name = "Name" , nullable = false)
	private String name;
	
	@Column (name = "Status" , nullable = false)
	private boolean status;
	
	//foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn (name = "CategoryID")
	Set<Product> productList = new HashSet<Product>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CategoryID")
	Size size = new Size();
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Set<Product> getProductList() {
		return productList;
	}
	public void setProductList(Set<Product> productList) {
		this.productList = productList;
	}
	public Category() {
		this.categoryID = 0;
		this.name = "";
		this.status = true;
		}
	public Category(int categoryID, String name, boolean status) {
		super();
		this.categoryID = categoryID;
		this.name = name;
		this.status = status;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", name=" + name + ", status=" + status + ", productList="
				+ productList + ", size=" + size + "]";
	}
	
}
