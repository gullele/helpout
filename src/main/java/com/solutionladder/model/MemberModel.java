package com.solutionladder.model;

import java.util.Date;

import com.solutionladder.dao.entity.Member;

public class MemberModel {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private Date dateRegistered;
	private Date lastLoggedIn;
	private boolean isActive;
	
	public MemberModel(){}
	public MemberModel(Member member) {
		this.firstName = member.getFirstName();
		this.lastName = member.getLastName();
		this.username = member.getUsername();
		this.password = member.getPassword();
		this.dateRegistered = member.getDateRegistered();
		this.lastLoggedIn = member.getLastLoggedIn();
		this.isActive = member.getIsActive();
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
