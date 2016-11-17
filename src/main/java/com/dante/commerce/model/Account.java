package com.dante.commerce.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "account")
public class Account implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "title", nullable = false, length = 30)
	private String title;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "userName", nullable = false, length = 30)
	private String userName;
	
	@Column(name = "password", nullable = false, length = 255)
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate")
	private Calendar createDate;

	public Account() {
	}

	public Account(final String title, final String email, final String userName, final String password, final Calendar createDate ) {
		super();
		this.title = title;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.createDate = createDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}
}
