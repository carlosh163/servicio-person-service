package com.springboot.appbanco.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personAuthorized")
public class PersonAuthorized extends Person{

	@Id
	private String idPersonAutho;
	
	private List<Account> accountList = new ArrayList<Account>();

	private char state;



	/*public String getIdPersonAutho() {
		return idPersonAutho;
	}



	public void setIdPersonAutho(String idPersonAutho) {
		this.idPersonAutho = idPersonAutho;
	}*/


	

	public char getState() {
		return state;
	}



	public String getIdPersonAutho() {
		return idPersonAutho;
	}



	public void setIdPersonAutho(String idPersonAutho) {
		this.idPersonAutho = idPersonAutho;
	}



	public List<Account> getAccountList() {
		return accountList;
	}



	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}



	public void setState(char state) {
		this.state = state;
	}

	
	
	
}
