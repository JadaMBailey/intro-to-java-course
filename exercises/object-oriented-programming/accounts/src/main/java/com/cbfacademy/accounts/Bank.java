package com.cbfacademy.accounts;

import java.util.ArrayList;
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
    List <Account> allAccounts;
    // want to link accountnumber varaible but problem appears, Map<accountNumber, Client> clients
    
    public void openCurentAcc(int inputBalance)
    {
        allAccounts = new <CurrentAccount> ArrayList();
        // Unsure if it is allAccounts.add();
    }

    public void openSavingAcc(int inputBalance)
    {
        allAccounts = new <SavingsAccount> ArrayList();
        // Unsure if it is allAccounts.add();
    }

    public void closeCurrentAcc(CurrentAccount currentAcc, String userId){
        allAccounts.remove();
    }
    
    public void closeSavingAcc(SavingsAccount savingAcc, String userId){
        allAccounts.remove();
    }

    public String geAccountdetails(Client userId)
   {
    System.out.println("Accont Holder: " + Client.getFullName);
      for(int i = 0; i <= allClients.size(); i++) 
      {
         if(allClients.getCurrent().get(i) == "current"|| "saving" || "current" && allClients.addSaving().get(i) == true){
            return getFirstAndLastName().concat("This account holder has both a savings account");
         } else if(allClients.addCurrent().get(i) == true && allClients.addSaving().get(i) == false){
            return getFirstAndLastName().concat(" - This account holder only has a Current account.");
         } else if(allClients.addCurrent().get(i) == false && allClients.addSaving().get(i) == true) {
            return getFirstAndLastName().concat(" - This account holder only has a Saving account.");
         } else{
           throw new IllegalArgumentException("Error there is no account assigned this account holder");
         }
      }
         
   }

    public Bank(int accountNumber, double balance){
        super(accountNumber, balance);// Have no idea why it is red
        
    }

    public void uniqueClientRef(){
        Map<Integer, String> concateClientId;
        // use this method to check that account number and userId is unique with all accounts
        // Not famillar with Map Framework, more research needed
    }

    public int allAccounts(){
      int totalOfAccounts = Client.accountsAll.size();
      // Not sure why 'accountsAll' variable is underlined red.
        return totalOfAccounts;

    }

    
    

}
