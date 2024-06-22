
package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Client {
   private String firstN;
   private String lastN;
   private String userName;
   private int passcode;
 
   
   public List <Account> accountsAll;

   public Client(String firstN, String lastN, String userName, int passcode, List<Account> accountsAll) {
      this.firstN = firstN;
      this.lastN = lastN;
      this.userName = userName;
      this.passcode = passcode;
      this.accountsAll = new ArrayList<>();
      
      // Create a new object, when object of Client is created
   }


   public String getFirstAndLastName(){
      return firstN.concat(lastN);
   }

   public String getUserId(){
      return userName;
      
   }

   public void setPasscode(String initialPasscode){
      
      // want to say if passcode over 6 chars or passcode not int values - throw error
      if(initialPasscode.limit > 6 || ) {
         throw new IllegalArgumentException();
         // throws error, as it doesn't meet criteria
      } else {
         this.passcode = initialPasscode;
      }
   
      // Scanner input int variable, limit to 6 char
   }

   public void addCurrent(CurrentAccount currentAccount){
      accountsAll.add(currentAccount);
   }

   public void removeCurrent(CurrentAccount currentAccount){
      accountsAll.remove(currentAccount);
   }

   public void addSaving(SavingsAccount savingAccount){
      accountsAll.add(savingAccount);
   }

   public void removeSaving(SavingsAccount savingsAccount){
      accountsAll.remove(savingsAccount);
   }

   public List <Account> geAccountdetails(){
      return accountsAll;

   }
   
    
   // Helpful Link:https://stackoverflow.com/questions/25952086/java-bank-program-how-to-let-customer-have-multiple-accounts



    
} 