package com.esprit.entities;
// Generated 30 juin 2018 15:25:25 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Customuserroles generated by hbm2java
 */
@Entity
@Table(name = "customuserroles", catalog = "bdnetjee")
public class Customuserroles implements java.io.Serializable {

	private Integer id;
	private Customroles customroles;
	private Users users;
	private int userId;
	private int roleId;

	public Customuserroles() {
	}

	public Customuserroles(int userId, int roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	public Customuserroles(Customroles customroles, Users users, int userId, int roleId) {
		this.customroles = customroles;
		this.users = users;
		this.userId = userId;
		this.roleId = roleId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomRole_Id")
	public Customroles getCustomroles() {
		return this.customroles;
	}

	public void setCustomroles(Customroles customroles) {
		this.customroles = customroles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_idUser")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "UserId", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "RoleId", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}
