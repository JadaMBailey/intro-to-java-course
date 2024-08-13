package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

  private double interestRate;
  private double balance;

  public SavingsAccount(int accountNumber, double balance, String accountType) {
    super(accountNumber, balance);
    this.setInterestRate(2);
    //this.interestRate = 2.0;
    this.balance = balance;
  }

  public void applyInterest() {
    deposit(
      balance * interestRate
      // able to call balance now it's protected
    );
  }

  public double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(double interestRate) {
    if (interestRate >= 0) {
      this.interestRate = interestRate;
      // can call set interest '2' method
    }
  }


}