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

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private int customerID;
	
	@Column(name = "Email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "Password", nullable = false)
	private String password;
	
	@Column(name = "Last_Name", nullable = false)
	private String lastName;
	
	@Column(name = "First_Name", nullable = false)
	private String firstName;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	
	@Column(name = "Points")
	private Long points;
	
	@Column(name = "Status" , nullable = false)
	private boolean status;

	// foreign key mapped
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID")
	PurchaseOrder purchaseOrder = new PurchaseOrder();
	
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Customer() {
		this.customerID = 0;
		this.email = "";
		this.password = "";
		this.lastName = "";
		this.firstName = "";
		this.address = "";
		this.phoneNumber = "";
		this.points = 0l;
		this.status = true;
	}

	public Customer(int customerID, String email, String password, String lastName, String firstName, String address,
			String phoneNumber, Long points, boolean status) {
		super();
		this.customerID = customerID;
		this.email = email;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.points = points;
		this.status = status;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", email=" + email + ", password=" + password + ", lastName="
				+ lastName + ", firstName=" + firstName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", points=" + points + ", status=" + status + ", purchaseOrder=" + purchaseOrder + "]";
	}
	
	
}
