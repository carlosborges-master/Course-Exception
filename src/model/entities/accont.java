package model.entities;

import model.Exceptions.AccountExceptions;

public class accont {
	
	private Integer number;
	private String holder;
	private Double balance;
	private double withdrawLimit;
	
	public accont(Integer number, String holder, Double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}	

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit( Double amount) {
		balance += amount;
	}
	public void withdraw( Double amount) {
		if (amount > withdrawLimit) {
			throw new AccountExceptions("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new AccountExceptions("Not enough balance");
		}
		
		balance -= amount;
	}

}
