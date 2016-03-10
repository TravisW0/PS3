package base;

import java.util.Date;

public class Account {

	/*
	 *  Data fields
	 */
	private int id=0;
	private double balance=0.0;
	private double annualInterestRate=0.0;
	private Date dateCreated;
	private double monthlyInterestRate=0.0;
	
	/*
	 *  no-arg constructor
	 */
	Account(){
	}
	
	/*
	 *  constructor that creates an account with the specified id and initial balance
	 */
	public Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	
	/*
	 *  mutator methods for id, balance, and annualInterestRate
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterstRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/*
	 *  accessor method for dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/*
	 *  monthly interest rate created and returned
	 */
	public double getMonthlyInterestRate() {
		double monthlyInterestRate =(annualInterestRate / 12);
		return(monthlyInterestRate);
	}

	/*
	 *  withdraw method
	 */
	public void withdraw(double amount1)throws InsufficientFundsException {
		if (amount1 < balance){
			balance -= amount1;
		}
		else{
			double need = amount1 - balance;
			throw new InsufficientFundsException(need);
		}
	}
	
	/*
	 *  deposit method
	 */
	public double deposit(double amount2) {
		return(balance += amount2);
	}
	
	
}