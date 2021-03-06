package org.meruvian.yama.bussiness.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="T_PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="PRICE", nullable=false, precision=18, scale=0)
	private BigDecimal price;
	
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	private List<SalesDetail> salesdetail;
	
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	private List<PurchaseDetail> purchasedetail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<SalesDetail> getSalesdetail() {
		return salesdetail;
	}

	public void setSalesdetail(List<SalesDetail> salesdetail) {
		this.salesdetail = salesdetail;
	}

	public List<PurchaseDetail> getPurchasedetail() {
		return purchasedetail;
	}

	public void setPurchasedetail(List<PurchaseDetail> purchasedetail) {
		this.purchasedetail = purchasedetail;
	}
	
	

}
