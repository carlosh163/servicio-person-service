package com.springboot.appbanco.model;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


//Ahorro.

public class Account {

	
	//private String codAccount;
	
	@Size(min = 3,message ="Tipo de Producto debe tener minimo 3 caracteres")
	private Integer accountNumber;
	
	//@JsonSerialize(using = ToStringSerializer.class)
	
	@JsonFormat(pattern = "dd-MM-yyyy",shape = Shape.STRING)
	private Date openingDate; // Fecha Apertura
	
	private double balance; //saldo
	
	
	private List<PersonAuthorized> personAuthorizedList; //Personas Autorizadas
	
	private char accountstatus; //Activo o Inactivo.

	/*public String getCodAccount() {
		return codAccount;
	}

	public void setCodAccount(String codAccount) {
		this.codAccount = codAccount;
	}*/

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	public List<PersonAuthorized> getPersonAuthorizedList() {
		return personAuthorizedList;
	}

	public void setPersonAuthorizedList(List<PersonAuthorized> personAuthorizedList) {
		this.personAuthorizedList = personAuthorizedList;
	}

	public char getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(char accountstatus) {
		this.accountstatus = accountstatus;
	}

	

	
	
	
	
	
	
	
	
	
}
