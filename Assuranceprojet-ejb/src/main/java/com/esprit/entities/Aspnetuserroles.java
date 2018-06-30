package com.esprit.entities;
// Generated 30 juin 2018 15:25:25 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Aspnetuserroles generated by hbm2java
 */
@Entity
@Table(name = "aspnetuserroles", catalog = "bdnetjee")
public class Aspnetuserroles implements java.io.Serializable {

	private AspnetuserrolesId id;

	public Aspnetuserroles() {
	}

	public Aspnetuserroles(AspnetuserrolesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "UserId", nullable = false, length = 128)),
			@AttributeOverride(name = "roleId", column = @Column(name = "RoleId", nullable = false, length = 128)) })
	public AspnetuserrolesId getId() {
		return this.id;
	}

	public void setId(AspnetuserrolesId id) {
		this.id = id;
	}

}