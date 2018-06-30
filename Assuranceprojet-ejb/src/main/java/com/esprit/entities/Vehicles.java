package com.esprit.entities;
// Generated 30 juin 2018 15:25:25 by Hibernate Tools 4.3.5.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vehicles generated by hbm2java
 */
@Entity
@Table(name = "vehicles", catalog = "bdnetjee")
public class Vehicles implements java.io.Serializable {

	private Integer idVehicle;
	private Fiscalpowers fiscalpowers;
	private Users users;
	private String registration;
	private String brand;
	private String model;
	private int seatsNumber;
	private double valueWhenNew;
	private double valueWhenVenal;
	private Date initTraficDate;
	private Set<Sinisters> sinisterses = new HashSet<Sinisters>(0);
	private Set<Contracts> contractses = new HashSet<Contracts>(0);
	private Set<Folders> folderses = new HashSet<Folders>(0);
	private Set<Wreckreports> wreckreportses = new HashSet<Wreckreports>(0);

	public Vehicles() {
	}

	public Vehicles(String registration, int seatsNumber, double valueWhenNew, double valueWhenVenal,
			Date initTraficDate) {
		this.registration = registration;
		this.seatsNumber = seatsNumber;
		this.valueWhenNew = valueWhenNew;
		this.valueWhenVenal = valueWhenVenal;
		this.initTraficDate = initTraficDate;
	}

	public Vehicles(Fiscalpowers fiscalpowers, Users users, String registration, String brand, String model,
			int seatsNumber, double valueWhenNew, double valueWhenVenal, Date initTraficDate,
			Set<Sinisters> sinisterses, Set<Contracts> contractses, Set<Folders> folderses,
			Set<Wreckreports> wreckreportses) {
		this.fiscalpowers = fiscalpowers;
		this.users = users;
		this.registration = registration;
		this.brand = brand;
		this.model = model;
		this.seatsNumber = seatsNumber;
		this.valueWhenNew = valueWhenNew;
		this.valueWhenVenal = valueWhenVenal;
		this.initTraficDate = initTraficDate;
		this.sinisterses = sinisterses;
		this.contractses = contractses;
		this.folderses = folderses;
		this.wreckreportses = wreckreportses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IdVehicle", unique = true, nullable = false)
	public Integer getIdVehicle() {
		return this.idVehicle;
	}

	public void setIdVehicle(Integer idVehicle) {
		this.idVehicle = idVehicle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FiscalPowers_IdFiscalPower")
	public Fiscalpowers getFiscalpowers() {
		return this.fiscalpowers;
	}

	public void setFiscalpowers(Fiscalpowers fiscalpowers) {
		this.fiscalpowers = fiscalpowers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Users_idUser")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "Registration", nullable = false, length = 15)
	public String getRegistration() {
		return this.registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	@Column(name = "Brand")
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "Model")
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "SeatsNumber", nullable = false)
	public int getSeatsNumber() {
		return this.seatsNumber;
	}

	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}

	@Column(name = "ValueWhenNew", nullable = false, precision = 22, scale = 0)
	public double getValueWhenNew() {
		return this.valueWhenNew;
	}

	public void setValueWhenNew(double valueWhenNew) {
		this.valueWhenNew = valueWhenNew;
	}

	@Column(name = "ValueWhenVenal", nullable = false, precision = 22, scale = 0)
	public double getValueWhenVenal() {
		return this.valueWhenVenal;
	}

	public void setValueWhenVenal(double valueWhenVenal) {
		this.valueWhenVenal = valueWhenVenal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "InitTraficDate", nullable = false, length = 19)
	public Date getInitTraficDate() {
		return this.initTraficDate;
	}

	public void setInitTraficDate(Date initTraficDate) {
		this.initTraficDate = initTraficDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicles")
	public Set<Sinisters> getSinisterses() {
		return this.sinisterses;
	}

	public void setSinisterses(Set<Sinisters> sinisterses) {
		this.sinisterses = sinisterses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicles")
	public Set<Contracts> getContractses() {
		return this.contractses;
	}

	public void setContractses(Set<Contracts> contractses) {
		this.contractses = contractses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicles")
	public Set<Folders> getFolderses() {
		return this.folderses;
	}

	public void setFolderses(Set<Folders> folderses) {
		this.folderses = folderses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicles")
	public Set<Wreckreports> getWreckreportses() {
		return this.wreckreportses;
	}

	public void setWreckreportses(Set<Wreckreports> wreckreportses) {
		this.wreckreportses = wreckreportses;
	}

}
