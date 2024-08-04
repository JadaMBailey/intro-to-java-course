package com.cbfacademy.accounts;


import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.SavingsAccount;

public class Bank1
{

    private String firstN;
    private String lastN;
    private String userId;
    List <Account> allAccounts = new <Account> ArrayList();
    // Where do I stare i want it to be kept in an ArrayList ' = new <Account> ArrayList()'

    public static final String SAVINGACCOUNT = "Saving account";
    public static final String CURRENTACCOUNT = "Current account";

    public Bank1(String firstN, String lastN, String userId){
        this.firstN = firstN;
        this.lastN = lastN;
        this.userId = userId;
    }

    public String getFullName()
    {
        return this.firstN.concat(this.lastN);
    }
  
    public void setFullName(String firstN, String lastN)
    {
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

    
    public void openAccount(int initialInput, String accountType) throws IllegalArgumentException
    {
        
        if(accountType == "saving account"){
           Account savingAccount = openSavingAcc(inputBalance, accountNumber);
            allAccounts.add(savingAccount);
        // accountNumber generator (Note to self: need to research algorithm to create)
        // Need to find a way of assigning accountNumber when instance created for allAccounts
    }   else if (accountType == "current account"){
       Account currentAccount = openCurentAcc(initialInput, accountNumber);
       allAccounts.add(currentAccount);
    } else{
        throw new IllegalArgumentException("account type input is wrong, please try again");
    }
    }

    public void openMultiAccount(int initialInput, String savingAccountOpen, String currentAccountOpen) throws IllegalArgumentException
    {
        
        if(savingAccountOpen == "saving account" && currentAccountOpen == "current account"){
           
            Account savingAccount = openSavingAcc(inputBalance, accountNumber);
            allAccounts.add(savingAccount);
            Account currentAccount = openCurentAcc(initialInput, accountNumber);
            allAccounts.add(currentAccount);
        } else{
            throw new IllegalArgumentException("account type input is wrong, please try again"); 
        }
    }

   

    public Account openSavingAcc(int inputBalance, int accountNumber)
    {

        return new SavingsAccount(accountNumber, balance, interestRate, SAVINGACCOUNT);
        // Unsure if it is allAccounts.add();

    }

    public Account openCurentAcc(int initialInput, int accountNumber )
    {
        // Unsure if it is allAccounts.add();
       return new CurrentAccount(accountNumber, balance,overdraftLimit, CURRENTACCOUNT);
    }


    public Account getAllAccounts()
    // displaying a report of all accounts held by the bank
    {   
        for(int i = 0; i <= allAccounts.length; i++){
            System.out.println(allAccounts[i]);
        }
        int totalOfAccounts = allAccounts.size();
        return totalOfAccounts;
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

    public int payDiv(){
        // loop through accounts
        // Extra - check for date condition 
        // Extra - status on the account (anything other than active don't pay)
        // get balance and increment by whatever ammount
    }

    // PayInterest -> Check if account 
    public int payInterest(){

        for(Account account: allAccounts){
            if(account.getAccountType().equals(SAVINGACCOUNT)){
                // add the interest
                // for each 
            }
            
        }
        return 0;
    }

    // notify Current account if overdrawn - methods
    // greater than 1 - fine 
    // less than 0 - notify 
    Arrays[] a = new Arrays[6]; 


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

}