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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERDETAIL")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OrderDetailID")
	private int orderDetailID;
	
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderID")
	private PurchaseOrder orderID;

	@Column(name = "LineTotal")
	private double lineTotal;

	// foreign key 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductID")
	private Product productID;

	// foreign key 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ShellMaterialID")
	private ShellMaterial shellMaterialID;
	
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SubDiamondID")
	private Diamond subDiamondID;
	
	//foreign key mapped
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderDetailID")
	Warranty warrantyList = new Warranty();
	
	public PurchaseOrder getOrderID() {
		return orderID;
	}

	public void setOrderID(PurchaseOrder orderID) {
		this.orderID = orderID;
	}

	public Warranty getWarrantyList() {
		return warrantyList;
	}

	public void setWarrantyList(Warranty warrantyList) {
		this.warrantyList = warrantyList;
	}

	@Column(name = "Size")
	private double size;
	
	@Column(name = "Status")
	private boolean status;

	public OrderDetail() {
		this.orderDetailID = 0;
		this.lineTotal = 0.00;
		this.size = 0.00;
		this.status = true;
	}

	public OrderDetail(int orderDetailID, double lineTotal, double size, boolean status) {
		super();
		this.orderDetailID = orderDetailID;
		this.lineTotal = lineTotal;
		this.size = size;
		this.status = status;
	}

	public int getOrderDetailID() {
		return orderDetailID;
	}

	public void setOrderDetailID(int orderDetailID) {
		this.orderDetailID = orderDetailID;
	}

	public PurchaseOrder getOderID() {
		return orderID;
	}

	public void setOderID(PurchaseOrder oderID) {
		this.orderID = oderID;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderDetailID=" + orderDetailID + ", orderID=" + orderID + ", lineTotal=" + lineTotal
				+ ", productID=" + productID + ", shellMaterialID=" + shellMaterialID + ", subDiamondID=" + subDiamondID
				+ ", warrantyList=" + warrantyList + ", size=" + size + ", status=" + status + "]";
	}

	public double getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(double lineTotal) {
		this.lineTotal = lineTotal;
	}

	public Product getProductID() {
		return productID;
	}

	public void setProductID(Product productID) {
		this.productID = productID;
	}

	public ShellMaterial getShellMaterialID() {
		return shellMaterialID;
	}

	public void setShellMaterialID(ShellMaterial shellMaterialID) {
		this.shellMaterialID = shellMaterialID;
	}

	public Diamond getSubDiamondID() {
		return subDiamondID;
	}

	public void setSubDiamondID(Diamond subDiamondID) {
		this.subDiamondID = subDiamondID;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
