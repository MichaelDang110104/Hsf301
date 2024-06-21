package com.backend.pojos;

import java.sql.Date;
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
@Table(name = "PROMOTION")
public class Promotion {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PromotionID")
	private int promotionID;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "Percentage" , nullable = false)
	private double percentage;
	
	@Column(name = "Valid_From" , nullable = false)
	private Date validFrom;
	
	@Column(name = "Valid_To")
	private Date validTo;
	
	@Column(name = "Description" , nullable = false)
	private String description;
	
	@Column(name = "Code" , nullable = false)
	private String code;
	
	@Column(name = "Status", nullable = false)
	private boolean status;
	
	//foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "PromotionID")
	Set<PurchaseOrder> purchaseOrderList = new HashSet<PurchaseOrder>();
	
	public Promotion() {
		this.promotionID = 0;
		this.name = "";
		this.percentage = 0.00;
		this.validFrom = null;
		this.validTo = null;
		this.description = "";
		this.code = "";
		this.status = true;
	}
	public Promotion(int promotionID, String name, double percentage, Date validFrom, Date validTo, String description,
			String code, boolean status) {
		super();
		this.promotionID = promotionID;
		this.name = name;
		this.percentage = percentage;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.description = description;
		this.code = code;
		this.status = status;
	}
	public int getPromotionID() {
		return promotionID;
	}
	public void setPromotionID(int promotionID) {
		this.promotionID = promotionID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Promotion [promotionID=" + promotionID + ", name=" + name + ", percentage=" + percentage
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", description=" + description + ", code="
				+ code + ", status=" + status + "]";
	}
	

}
