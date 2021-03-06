package com.esprit.entities;
// Generated 30 juin 2018 15:25:25 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rcprices generated by hbm2java
 */
@Entity
@Table(name = "rcprices", catalog = "bdnetjee")
public class Rcprices implements java.io.Serializable {

	private Integer idRcp;
	private Classes classes;
	private Fiscalpowers fiscalpowers;
	private Rcprices rcprices;
	private float price;
	private Set<Rcprices> rcpriceses = new HashSet<Rcprices>(0);

	public Rcprices() {
	}

	public Rcprices(float price) {
		this.price = price;
	}

	public Rcprices(Classes classes, Fiscalpowers fiscalpowers, Rcprices rcprices, float price,
			Set<Rcprices> rcpriceses) {
		this.classes = classes;
		this.fiscalpowers = fiscalpowers;
		this.rcprices = rcprices;
		this.price = price;
		this.rcpriceses = rcpriceses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idRCP", unique = true, nullable = false)
	public Integer getIdRcp() {
		return this.idRcp;
	}

	public void setIdRcp(Integer idRcp) {
		this.idRcp = idRcp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_idCla")
	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fiscalPower_IdFiscalPower")
	public Fiscalpowers getFiscalpowers() {
		return this.fiscalpowers;
	}

	public void setFiscalpowers(Fiscalpowers fiscalpowers) {
		this.fiscalpowers = fiscalpowers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RCPrice_idRCP")
	public Rcprices getRcprices() {
		return this.rcprices;
	}

	public void setRcprices(Rcprices rcprices) {
		this.rcprices = rcprices;
	}

	@Column(name = "price", nullable = false, precision = 12, scale = 0)
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rcprices")
	public Set<Rcprices> getRcpriceses() {
		return this.rcpriceses;
	}

	public void setRcpriceses(Set<Rcprices> rcpriceses) {
		this.rcpriceses = rcpriceses;
	}

}
