package com.cbfacademy.accounts;

import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.List;



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
    
    // want to link accountnumber varaible but problem appears, Map<accountNumber, Client> clients
    private String firstN;
    private String lastN;
    private String userId;
    private int balance;
    private int accountNumber; // ?
    List <Account> allAccounts;

    public Bank(String firstN, String lastN, String userId){
        this.firstN = firstN;
        this.lastN = lastN;
        this.userId = userId;
    }

    public String getFullName(){
        return this.firstN.concat(this.lastN);
     }
  
     public void setFullName(String firstN, String lastN){
        this.firstN = firstN;
        this.lastN = lastN;
        // Change of name e.g Marriage / deed poll
     }
  
     public String getUserId(){
        return this.userId;
        
     }
  
     public void setUserId(String chgUserId) throws NumberFormatException{
        try {
            this.userId = chgUserId; //  // To make it possible for client to change username
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
         
       
     }


    public void openCurentAcc(int initialInput, int accountNumber)
    {
        this.balance += initialInput;
        allAccounts = new <CurrentAccount> ArrayList();
        // Unsure if it is allAccounts.add();
       
    }

    public void openSavingAcc(int inputBalance, int accountNumber)
    {
        this.balance = inputBalance;
        allAccounts = new <SavingsAccount> ArrayList();
        // Unsure if it is allAccounts.add();

    }

    public void closeCurrentAcc(CurrentAccount currentAcc, String userId){
        if(userId.equals(this.userId)){
            allAccounts.remove(currentAcc); // Have no idea why red
        } else{
            throw new IllegalArgumentException("Wrong username entered. Please double check info and try again");
        }
        
    }
    
    public void closeSavingAcc(SavingsAccount savingAcc, String userId) throws IllegalAccessException{
        if(userId.equals(this.userId)){
            allAccounts.remove(savingAcc);
            // think I need to make a getSavingAcc method to input in parenthesis
        } else{
            throw new IllegalArgumentException("Wrong username entered. Please double check info and try again");  
        }
       
    }
    

    public void geAccountdetails(int accountNumber)
    {
    boolean hasCurrentAccount = false;
    boolean hasSavingsAccount = false;
   
    for(Account account: allAccounts){
        if(account instanceof CurrentAccount){
            hasCurrentAccount = true;
        }else if(account instanceof SavingsAccount){
            hasSavingsAccount = true;
        }else{
            ;
        }
    }

    if(!hasCurrentAccount && !hasSavingsAccount){
       System.out.println("Account " + accountNumber + " not found. Action required");
    } else if(hasCurrentAccount){
        System.out.println("Account " + accountNumber + " has a current account. No action required");
    }else{
        System.out.println("Account " + accountNumber + " has a saving account. No action required");
    }
    }

    // System.out.println("Accont Holder: " + Client.getFullName);
    //   for(int i = 0; i <= allClients.size(); i++) 
    //   {
    //      if(allClients.getCurrent().get(i) == "current"|| "saving" || "current" && allClients.addSaving().get(i) == true){
    //         return getFirstAndLastName().concat("This account holder has both a savings account");
    //      } else if(allClients.addCurrent().get(i) == true && allClients.addSaving().get(i) == false){
    //         return getFirstAndLastName().concat(" - This account holder only has a Current account.");
    //      } else if(allClients.addCurrent().get(i) == false && allClients.addSaving().get(i) == true) {
    //         return getFirstAndLastName().concat(" - This account holder only has a Saving account.");
    //      } else{
    //        throw new IllegalArgumentException("Error there is no account assigned this account holder");
    //      }
    //   }
         
   

    // public void uniqueClientRef(){
    //     Map<Integer, String> concateClientId;
    //     // use this method to check that account number and userId is unique with all accounts
    //     // Not famillar with Map Framework, more research needed
    // }

    public int getTotalAccounts(){
      int totalOfAccounts = allAccounts.size();
        return totalOfAccounts;

    }

    
    


}
