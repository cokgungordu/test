package com.dante.commerce.model.form;

import java.util.Calendar;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.dante.commerce.model.Account;

public class AccountForm {

	private long id;

	@NotBlank
//	@Length(max=30, message="{validation.maxStringLength}")
	private String title;
	
	@Email
	@NotBlank
//	@Length(max=100, message="{validation.maxStringLength}")
	private String email;
	
	@NotBlank
//	@Length(max=30, message="{validation.maxStringLength}")
	private String userName;
	
	private Calendar createDate;
	
	public void mapToAccount(Account account) {
		account.setTitle(this.title);
		account.setEmail(this.email);
		account.setUserName(this.userName);
	}
	
	public void mapFromAccount(Account account) {
		// account specific information
		this.setTitle(account.getTitle());
		this.setEmail(account.getEmail());
		this.setUserName(account.getUserName());
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

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}
}
