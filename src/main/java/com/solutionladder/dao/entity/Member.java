package com.solutionladder.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Base class for member. A member can help or can be helped out.
 * 
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 */
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(nullable = true)
	protected String firstName;

	@Column(nullable = true)
	protected String lastName;

	@Column(nullable = false, unique = true)
	protected String username;

	@Column(nullable = false)
	protected String salt;

	@Column(nullable = false)
	protected String password;

	@Column(nullable = false)
	protected Date dateRegistered;

	@Column(nullable = false)
	protected Date lastLoggedIn;

	@Column
	protected Boolean isActive = true;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
