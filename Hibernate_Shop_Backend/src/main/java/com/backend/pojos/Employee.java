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
@Table(name = "EMPLOYEES")
public class Employee {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private int employeeID;
	
	@Column(name = "Role", nullable = false)
	private String role;
	
	@Column(name = "Email", nullable = false)
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
	
	@Column(name = "Status" , nullable = false)
	private boolean status;
	
	// foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Sale_Staff_ID")
	Set<PurchaseOrder> saleStaff = new HashSet<PurchaseOrder>();
	
	// foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Delivery_Staff_ID")
	Set<PurchaseOrder> deliveryStaff = new HashSet<PurchaseOrder>();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeID, String role, String email, String password, String lastName, String firstName,
			String address, String phoneNumber, boolean status) {
		super();
		this.employeeID = employeeID;
		this.role = role;
		this.email = email;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.status = status;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", role=" + role + ", email=" + email + ", password=" + password
				+ ", lastName=" + lastName + ", firstName=" + firstName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", status=" + status + "]";
	}
	
}
