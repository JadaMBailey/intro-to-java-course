
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
   private List <Account> accountToUser;

   public Client(String firstN, String lastN, String userName, int passcode) {
      this.firstN = firstN;
      this.lastN = lastN;
      this.userName = userName;
      this.passcode = passcode;
      this.accountToUser = new ArrayList<>();
      
      // When object of Client is created, create a new object
      //Problem, two objects will be created in the process as you make an object of Client class to access the constructor input
   }


   public String getFirstAndLastName(){
      return firstN.concat(lastN);
   }

   public String getUserId(){
      return userName;
      
   }

   public void setUserId(String chgUserId){
       userName = chgUserId;
      // To make it possible for client to change username
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
      accountToUser.add(currentAccount);
   }

   public void removeCurrent(CurrentAccount currentAccount){
      accountToUser.remove(currentAccount);
   }

   public void addSaving(SavingsAccount savingAccount){
      accountToUser.add(savingAccount);
   }

   public void removeSaving(SavingsAccount savingsAccount){
      accountToUser.remove(savingsAccount);
   }

   public String geAccountdetails()
   {
      for(int i = 0; i <= accountToUser.size(); i++) 
      {
         if(accountToUser.addCurrent().get(i) == true && accountToUser.addSaving().get(i) == true){
            return getFirstAndLastName().concat("This account holder has both a savings account");
         } else if(accountToUser.addCurrent().get(i) == true && accountToUser.addSaving().get(i) == false){
            return getFirstAndLastName().concat(" - This account holder only has a Current account.");
         } else if(accountToUser.addCurrent().get(i) == false && accountToUser.addSaving().get(i) == true) {
            return getFirstAndLastName().concat(" - This account holder only has a Saving account.");
         } else{
           throw new IllegalArgumentException("Error there is no account assigned this account holder");
         }
      }
         
   }
      // Account holder's Full name, whether they have a savings, current or both (think of FizzBuzz)

   }
    
