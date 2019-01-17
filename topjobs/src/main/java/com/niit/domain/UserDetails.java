package com.niit.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "user_Sequence")
	@SequenceGenerator(name = "user_Sequence", sequenceName = "USER_SEQ")
	Long userId;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User getUsr() {
		return usr;
	}

	public void setUsr(User usr) {
		this.usr = usr;
	}

	@OneToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name= "user_name", 
	referencedColumnName = "user_name")
	User usr;
	
	@Column
	Date validDate;
	
	@Column
	Boolean status;

	

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	 
}