package main.java.com.cbfacademy.accounts;
// why does the package need to include so many folders

import java.util.ArrayList;
import java.util.List;

public class Bank1
{

    private String firstN;
    private String lastN;
    private String userId;
    List <Account> allAccounts;
    // Where do I stare i want it to be kept in an ArrayList ' = new <Account> ArrayList()'

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
        this.balance+= initialInput;
        if(accountType == "saving account"){
            openSavingAcc(inputBalance, accountNumber);
        // accountNumber generator (Note to self: need to research algorithm to create)
        // Need to find a way of assigning accountNumber when instance created for allAccounts
    }   else if (accountType == "current account"){
        openCurentAcc(initialInput, accountNumber);
    } else{
        throw new IllegalArgumentException("account type input is wrong, please try again");
    }
    }

    public void openMultiAccount(int initialInput, String savingAccountOpen, String currentAccountOpen) throws IllegalArgumentException
    {
        this.balance+= initialInput;
        if(savingAccountOpen == "saving account" && currentAccountOpen == "current account"){
            openSavingAcc(inputBalance, accountNumber);
            openCurentAcc(initialInput, accountNumber);
        } else{
            throw new IllegalArgumentException("account type input is wrong, please try again"); 
        }
    }

   

    public void openSavingAcc(int inputBalance, int accountNumber)
    {
        this.balance = inputBalance;
        allAccounts = new <SavingsAccount> ArrayList();
        // Unsure if it is allAccounts.add();

    }

    public void openCurentAcc(int initialInput, int accountNumber)
    {
        this.balance += initialInput;
        allAccounts = new <CurrentAccount> ArrayList();
        // Unsure if it is allAccounts.add();
       
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





}