
package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Client {
   private String firstN;
   private String lastN;
   private String userId;
   private int passcode;
   private List <Client> allClients;

   public Client(String firstN, String lastN, String userId, int passcode) {
      this.firstN = firstN;
      this.lastN = lastN;
      this.userId = userId;
      this.passcode = passcode;
      this.allClients = new ArrayList<Client>();
      
      // When object of Client is created, create a new object
   }


   public String getFullName(){
      return this.firstN.concat(this.lastN);
   }

   public void setFullName(String firstN, String lastN){
      this.firstN = firstN;
      this.lastN = lastN;
   }

   public String getUserId(){
      return this.userId;
      
   }

   public void setUserId(String chgUserId){
       this.userId = chgUserId;
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

   }
    
