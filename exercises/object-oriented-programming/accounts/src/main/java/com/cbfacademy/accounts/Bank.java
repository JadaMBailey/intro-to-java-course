package com.cbfacademy.accounts;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cbfacademy.App;


public class Bank {
    // Purpose is to manage accounts internally (no client input)
    /*
     *  Stretch Goal

        If you have extra time in the session, or wish to experiment further, create a `Bank` class to manage accounts. Consider the following ideas — you may choose to implement some, all or come up with your own:
        - storing a internal list of accounts. Remember that accounts in the list could be instances of the `Account` class, the `SavingsAccount` class, or the `CurrentAccount` class.
        - opening a new account, given a type and balance.
        - getting a list of account numbers held by the bank
        - getting an account, given an account number
        - closing an account, given an account number
        - displaying a report of all accounts held by the bank
        - paying a dividend to all accounts held by the bank
        - applying interest to all savings accounts
        - contacting all current account holders if their account is in overdraft.
     * 
     */
    public Map<Integer, Client> clients;
    // want to link accountnumber varaible but problem appears, Map<accountNumber, Client> clients
    

    public Bank(int accountNumber, double balance){
        super(accountNumber, balance);// Have no idea why it is red
        
    }

    public void uniqueClientRef(){
        Map<Integer, String> concateClientId;
        // use this method to check that account number and userId is unique with all accounts
    }

    public int allAccounts(){
      int totalOfAccounts = Client.accountsAll.size();
      // Not sure why 'accountsAll' variable is underlined red.
        return totalOfAccounts;

    }

    

}
