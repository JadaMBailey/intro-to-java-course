package com.cbfacademy.accounts;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cbfacademy.App;


public class Bank {
    // Purpose is to manage accounts internally (no client input)
    

    public Bank(Scanner input, int accountNumber, double balance){
        super(accountNumber, balance);// Have no idea why it is red
        
    }

    public void uniqueClientRef(){
        Map<Integer, String> concateClientId;
        // use this method to check that account number and userId is unique with all accounts
    }

    public void createAccount(){
        // type of account & balance
        

    //     Account openCurrent = new CurrentAccount(accountNumber, balance, 0);
    //     Account openSaver = new SavingsAccount(accountNumber, balance, 2.5);
    //    Account[] selectionType = new Account[2];
    //     selectionType[0] = openCurrent;
    //     selectionType[1] = openSaver;
    }

    public int allAccounts(){
        List<E> <Account> allAccounts = new Account(1000); 
        return allAccounts.size;
    }

    public void getAccount(){
        // able to get account details dependent on account number
        // output account njmber assigned to fName + lName, date account created
    }

    public void closeAccount(){
        // remove function of instance created
        // Ensure it doesn't impact other 
    }
}
