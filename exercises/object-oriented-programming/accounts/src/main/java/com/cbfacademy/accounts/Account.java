package com.cbfacademy.accounts;

import java.util.List;

public class Account {
protected int accountNumber;
// private allows you change code in less places

protected double balance;

public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
}

public Account(double balance){
    this.balance = balance;
}

public double getBalance(){
    return balance;
    // returns the current account balance
}

public int getAccountNumber(){
   
    return accountNumber;
}

public double deposit(double amount){
   return balance += amount;
}

public double withdraw(double requested){
    // This method checks whether there is sufficient funds to make the necessary withdrawal
if (requested < 0 || balance < requested){
return 0;
}else {
    balance -= requested;
    return requested;
}
}

}