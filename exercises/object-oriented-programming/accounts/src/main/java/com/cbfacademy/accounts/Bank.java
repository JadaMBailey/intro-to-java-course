package com.cbfacademy.accounts;


import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.time.*;
import java.util.random.*;

import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.SavingsAccount;

public class Bank
{

    private String firstN;
    private String lastN;
    private String userId;
    List <Account> allAccounts = new ArrayList<>();
    

    private static final String SAVING_ACCOUNT = "Saving account";
    public static String getSavingAccount() {
        return SAVING_ACCOUNT;
    }

    private static final String CURRENT_ACCOUNT = "Current account";
    public static String getCurrentaccount() {
        return CURRENT_ACCOUNT;
    }

   

    public Bank(String firstN, String lastN, String userId){
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

    public void openAccount(int balance, String accountType) throws IllegalArgumentException
    {
        Random rd = new Random();
        int accountNumber;
        
        if(accountType.equals("saving account")){
         accountNumber = rd.nextInt(1000000);//challenge: Fetch incremented of account to database
           Account SAVING_ACCOUNT = openSavingAcc(balance, accountNumber); 
            allAccounts.add(SAVING_ACCOUNT);//challenge: would make database call 
        // accountNumber generator (Note to self: need to research algorithm to create)
        
    }   else if (accountType.equals("current account")){
        accountNumber = rd.nextInt(1000000);
       Account currentAccount = openCurentAcc(balance, accountNumber); // Why is accountNumber red? 
       allAccounts.add(currentAccount);
    } else{
        throw new IllegalArgumentException("account type input is wrong, please try again");
    }
    }

    public void openMultiAccount(int balance, String SAVING_ACCOUNTOpen, String currentAccountOpen) throws IllegalArgumentException
    {
        Random rd = new Random();
        int accountNumber;
        
        if(SAVING_ACCOUNTOpen == "saving account" && currentAccountOpen == "current account"){
            accountNumber = rd.nextInt(1000000);
            Account SAVING_ACCOUNT = openSavingAcc(balance, accountNumber);
            allAccounts.add(SAVING_ACCOUNT);
            Account currentAccount = openCurentAcc(balance, accountNumber);
            allAccounts.add(currentAccount);
        } else{
            throw new IllegalArgumentException("account type input is wrong, please try again"); 
        }
    }

   

    public Account openSavingAcc(int balance, int accountNumber)
    {
        
        return new SavingsAccount(accountNumber, balance, SAVING_ACCOUNT);
    }

    public Account openCurentAcc(int balance, int accountNumber )
    {
       
       return new CurrentAccount(accountNumber, balance, CURRENT_ACCOUNT);
       // variables, 'balance' and 'overdraftLimit' was showing red, not sure what the issue is. So tried to change it to get method incase of inaccessibility issues.
    }


    public void getAllAccounts()
    // displaying a report of all accounts held by the bank
    {   
       
        // for(int i = 0; i <= allAccounts.size(); i++){
        //    System.out.println(allAccounts.get(i).getAccountType() + getUserId());
        // }
        for(Account acc: allAccounts){
             System.out.println(acc.getAccountType() + getUserId());
        }
        
    }

    public void getAccountDetails(int accountNumber)
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
        int dividends;
        int dividendsAdded = 0;
        for(Account account: allAccounts){
            if(account.deposit(5000) && LocalDateTime.of(2024, 08, 28, 23, 59) ){
              dividendsAdded = getBalance() + dividends;
            }else {
                // nothing happens
            }
            // Need to research how to put a time on when they can deposit money.
        } 
        return dividendsAdded;
        // Need to search 
    }

 
    public double payInterest(){
        double result = 0;
        double interestAdded;
        for(Account account: allAccounts){
            if(account.getAccountType().equals(SAVING_ACCOUNT)){
                result = ((SavingsAccount) account).setInterestRate(interestAdded).applyInterest();
                // applyInterest() in SavingsAccount does not return anything, should I change that?
                
            }
            else {
                result;
                // I would prefer it to return a message "Not a Savings Account, no interest"
            }
        }
        return result;
    }

    public String notifyOverdrawn(){
         for (Account account: allAccounts){
            if(account.getAccountType().equals(CURRENT_ACCOUNT) && account.getBalance() < 0){
                System.out.println("Account " + account.getAccountNumber() + " is overdrawn.");
            } else{
               System.out.println("No notification needed.");
            }

         }
        
        // notify Current account if overdrawn - methods
        // greater than 1 - no notfication, so fine 
        // less than 0 - notify by sending message or email  
        return "";
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

}