package com.backend.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SIZE")
public class Size {
	// foreign key 
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CategoryID")
	private Category categoryID;
	
	@Column(name = "MinSize")
	private double minSize;
	
	@Column(name = "MaxSize")
	private double maxSize;
	
	@Column(name = "Step")
	private double step;

	public Size() {
		this.minSize = 0.00;
		this.maxSize = 0.00;
		this.step = 0.00;
	}

	public Size(double minSize, double maxSize, double step) {
		super();
		this.minSize = minSize;
		this.maxSize = maxSize;
		this.step = step;
	}

	public Category getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Category categoryID) {
		this.categoryID = categoryID;
	}

	public double getMinSize() {
		return minSize;
	}

	public void setMinSize(double minSize) {
		this.minSize = minSize;
	}

	public double getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(double maxSize) {
		this.maxSize = maxSize;
	}

	public double getStep() {
		return step;
	}

	public void setStep(double step) {
		this.step = step;
	}

	@Override
	public String toString() {
		return "Size [categoryID=" + categoryID + ", minSize=" + minSize + ", maxSize=" + maxSize + ", step=" + step
				+ "]";
	}
	
}
