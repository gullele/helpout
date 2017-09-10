package com.solutionladder.model;

import java.util.Date;

import com.solutionladder.dao.entity.Donor;

public class DonorModel {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private Date dateRegistered;
	private Date lastLoggedIn;
	private boolean isActive;
	
	public DonorModel(){}
	public DonorModel(Donor donor) {
		this.firstName = donor.getFirstName();
		this.lastName = donor.getLastName();
		this.username = donor.getUsername();
		this.password = donor.getPassword();
		this.dateRegistered = donor.getDateRegistered();
		this.lastLoggedIn = donor.getLastLoggedIn();
		this.isActive = donor.getIsActive();
	}
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
