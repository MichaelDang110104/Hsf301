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
import javax.persistence.Table;

@Entity
@Table(name = "DIAMONDS")
public class Diamond {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DiamondID")
	private int diamond;
	
	@Column (name =  "Shape")
	private String shape;
	
	@Column(name = "Color")
	private String color;
	
	@Column(name = "Clarity")
	private String clarity;
	
	@Column(name = "Carat")
	private String carat;
	
	@Column(name = "Cut")
	private String cut;
	
	@Column(name = "Certificate_Scan")
	private String certificateScan;
	
	@Column(name = "Amount_Available")
	private int amountAvailable;
	
	@Column(name = "Status")
	private boolean status;
	
	// foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductID")
	Set<Product> productList = new HashSet<Product>();
	
	
	// foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SubDiamondID")
	Set<OrderDetail> subDiamondList = new HashSet<OrderDetail>();
	
	public Set<Product> getProductList() {
		return productList;
	}
	public void setProductList(Set<Product> productList) {
		this.productList = productList;
	}
	public Diamond() {
		this.diamond = 0;
		this.shape = "";
		this.color = "";
		this.clarity = "";
		this.carat = "";
		this.cut = "";
		this.certificateScan = "";
		this.amountAvailable = 0;
		this.status = true;
	}
	public Diamond(int diamond, String shape, String color, String clarity, String carat, String cut,
			String certificateScan, int amountAvailable, boolean status) {
		super();
		this.diamond = diamond;
		this.shape = shape;
		this.color = color;
		this.clarity = clarity;
		this.carat = carat;
		this.cut = cut;
		this.certificateScan = certificateScan;
		this.amountAvailable = amountAvailable;
		this.status = status;
	}
	public int getDiamond() {
		return diamond;
	}
	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getClarity() {
		return clarity;
	}
	public void setClarity(String clarity) {
		this.clarity = clarity;
	}
	public String getCarat() {
		return carat;
	}
	public void setCarat(String carat) {
		this.carat = carat;
	}
	public String getCut() {
		return cut;
	}
	public void setCut(String cut) {
		this.cut = cut;
	}
	public String getCertificateScan() {
		return certificateScan;
	}
	public void setCertificateScan(String certificateScan) {
		this.certificateScan = certificateScan;
	}
	public int getAmountAvailable() {
		return amountAvailable;
	}
	public void setAmountAvailable(int amountAvailable) {
		this.amountAvailable = amountAvailable;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Diamond [diamond=" + diamond + ", shape=" + shape + ", color=" + color + ", clarity=" + clarity
				+ ", carat=" + carat + ", cut=" + cut + ", certificateScan=" + certificateScan + ", amountAvailable="
				+ amountAvailable + ", status=" + status + "]";
	}
	 
}
