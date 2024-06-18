package com.backend.pojos;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WARRANTY")
public class Warranty {
	// foreign key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WarrantyID")
	private int warrantyID;

	public int getWarrantyID() {
		return warrantyID;
	}

	public void setWarrantyID(int warrantyID) {
		this.warrantyID = warrantyID;
	}

	// foreign key
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderDetailID")
	private OrderDetail orderDetailID;

	@Column(name = "StartDate")
	private Date startDate;

	@Column(name = "EndDate")
	private Date endDate;

	@Column(name = "Status")
	private boolean status;

	public Warranty() {
		this.startDate = null;
		this.endDate = null;
		this.status = true;
	}

	public Warranty(Date startDate, Date endDate, boolean status) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public OrderDetail getOrderDetailID() {
		return orderDetailID;
	}

	public void setOrderDetailID(OrderDetail orderDetailID) {
		this.orderDetailID = orderDetailID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Warranty [warrantyID=" + warrantyID + ", orderDetailID=" + orderDetailID + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", status=" + status + "]";
	}

}
