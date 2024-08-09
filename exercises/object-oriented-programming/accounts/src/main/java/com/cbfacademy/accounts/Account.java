package com.cbfacademy.accounts;

import java.util.List;
// Need to research access type for classes purposes
public class Account {
private int accountNumber;
// private allows you change code in less places
private String accountType;

private double balance;

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

public String getAccountType(){
   
    return accountType;
}

public void setAccountType(String accountType){
    
     this.accountType = accountType;
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