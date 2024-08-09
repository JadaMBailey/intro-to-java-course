package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

  private double interestRate;
  private double balance;

  public SavingsAccount(int accountNumber, double balance, double interestRate, String accountType) {
    super(accountNumber, balance);
    this.interestRate = interestRate;
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
    }
  }


}