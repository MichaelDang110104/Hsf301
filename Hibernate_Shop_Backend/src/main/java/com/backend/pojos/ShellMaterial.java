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
@Table(name = "SHELLMATERIALS")
public class ShellMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ShellID")
	private int shellID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Amount")
	private double amount;
	
	@Column(name = "Status")
	private boolean status;

	// foreign key mapped
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ShellMaterialID")
	Set<OrderDetail> orderDetailShell = new HashSet<OrderDetail>();
	
	public Set<OrderDetail> getOrderDetailShell() {
		return orderDetailShell;
	}

	public void setOrderDetailShell(Set<OrderDetail> orderDetailShell) {
		this.orderDetailShell = orderDetailShell;
	}

	public ShellMaterial() {
		this.shellID = 0;
		this.name = "";
		this.amount = 0.00;
		this.status = true;
	}

	public ShellMaterial(int shellID, String name, double amount, boolean status) {
		super();
		this.shellID = shellID;
		this.name = name;
		this.amount = amount;
		this.status = status;
	}

	public int getShellID() {
		return shellID;
	}

	public void setShellID(int shellID) {
		this.shellID = shellID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ShellMaterial [shellID=" + shellID + ", name=" + name + ", amount=" + amount + ", status=" + status
				+ "]";
	}

}
