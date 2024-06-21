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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASEORDERS")
public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private int oderID;
	// foreign key
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "UserID" , nullable = false)
	private Customer userID;
	
	@Column(name = "CreateDate", nullable = false)
	private Date createDate;
	
	@Column(name = "PaymentMethod", nullable = false)
	private String paymentMethod;
	
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "PhoneNumber", nullable = false)
	private String phoneNumber;
	
	@Column(name = "ShippingAddress", nullable = false)
	private String shippingAddress;
	
	@Column(name = "TotalPrice", nullable = false)
	private double totalPrice;
	
	@Column(name = "OrderStatus", nullable = false)
	private String orderStatus;
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PromotionID")
	private Promotion promotionID;

	private boolean payWithPoints;
	private String note;
	
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Sale_Staff_ID")
	private Employee saleStaff;
	
	// foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Delivery_Staff_ID")
	private Employee deliveryStaff;

	// foreign key mapped
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderID")
	OrderDetail orderIDList = new OrderDetail();

	
	public OrderDetail getOrderIDList() {
		return orderIDList;
	}

	public void setOrderIDList(OrderDetail orderIDList) {
		this.orderIDList = orderIDList;
	}

	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
		this.oderID = 0;
		this.createDate = null;
		this.paymentMethod = "";
		this.name = "";
		this.phoneNumber = "";
		this.shippingAddress = "";
		this.totalPrice = 0.00;
		this.orderStatus = "";
		this.payWithPoints = true;
		this.note = "";
	}

	public PurchaseOrder(int oderID, Date createDate, String paymentMethod, String name, String phoneNumber,
			String shippingAddress, double totalPrice, String orderStatus, boolean payWithPoints, String note) {
		super();
		this.oderID = oderID;
		this.createDate = createDate;
		this.paymentMethod = paymentMethod;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.shippingAddress = shippingAddress;
		this.totalPrice = totalPrice;
		this.orderStatus = orderStatus;
		this.payWithPoints = payWithPoints;
		this.note = note;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [oderID=" + oderID + ", userID=" + userID + ", createDate=" + createDate
				+ ", paymentMethod=" + paymentMethod + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", shippingAddress=" + shippingAddress + ", totalPrice=" + totalPrice + ", orderStatus=" + orderStatus
				+ ", promotionID=" + promotionID + ", payWithPoints=" + payWithPoints + ", note=" + note
				+ ", saleStaff=" + saleStaff + ", deliveryStaff=" + deliveryStaff + ", orderIDList=" + orderIDList
				+ "]";
	}

	public int getOderID() {
		return oderID;
	}

	public void setOderID(int oderID) {
		this.oderID = oderID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Promotion getPromotionID() {
		return promotionID;
	}

	public void setPromotionID(Promotion promotionID) {
		this.promotionID = promotionID;
	}

	public boolean isPayWithPoints() {
		return payWithPoints;
	}

	public void setPayWithPoints(boolean payWithPoints) {
		this.payWithPoints = payWithPoints;
	}

	public Customer getUserID() {
		return userID;
	}

	public void setUserID(Customer userID) {
		this.userID = userID;
	}

	public Employee getSaleStaff() {
		return saleStaff;
	}

	public void setSaleStaff(Employee saleStaff) {
		this.saleStaff = saleStaff;
	}

	public Employee getDeliveryStaff() {
		return deliveryStaff;
	}

	public void setDeliveryStaff(Employee deliveryStaff) {
		this.deliveryStaff = deliveryStaff;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
