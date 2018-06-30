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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fiscalpowers generated by hbm2java
 */
@Entity
@Table(name = "fiscalpowers", catalog = "bdnetjee")
public class Fiscalpowers implements java.io.Serializable {

	private Integer idFiscalPower;
	private int fpower;
	private Set<Rcprices> rcpriceses = new HashSet<Rcprices>(0);
	private Set<Vehicles> vehicleses = new HashSet<Vehicles>(0);

	public Fiscalpowers() {
	}

	public Fiscalpowers(int fpower) {
		this.fpower = fpower;
	}

	public Fiscalpowers(int fpower, Set<Rcprices> rcpriceses, Set<Vehicles> vehicleses) {
		this.fpower = fpower;
		this.rcpriceses = rcpriceses;
		this.vehicleses = vehicleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IdFiscalPower", unique = true, nullable = false)
	public Integer getIdFiscalPower() {
		return this.idFiscalPower;
	}

	public void setIdFiscalPower(Integer idFiscalPower) {
		this.idFiscalPower = idFiscalPower;
	}

	@Column(name = "FPower", nullable = false)
	public int getFpower() {
		return this.fpower;
	}

	public void setFpower(int fpower) {
		this.fpower = fpower;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fiscalpowers")
	public Set<Rcprices> getRcpriceses() {
		return this.rcpriceses;
	}

	public void setRcpriceses(Set<Rcprices> rcpriceses) {
		this.rcpriceses = rcpriceses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fiscalpowers")
	public Set<Vehicles> getVehicleses() {
		return this.vehicleses;
	}

	public void setVehicleses(Set<Vehicles> vehicleses) {
		this.vehicleses = vehicleses;
	}

}
