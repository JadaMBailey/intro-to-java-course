package com.cbfacademy;

import java.io.IOException;

import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.Bank;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;

public class App 
{
   
    public static void main(String[] args) 
    {
      Bank jBailey = new Bank("Jada", "Bailey", "Jbkoala");
      jBailey.openAccount(1200, "saving account");
      jBailey.geAccountdetails(32418675);
      jBailey.getAllAccounts();
      
      
    }


        // Need to find out why I can't input instance variable in place. 
     
        // Need to know how to create an current account object without assigning variable name to it, or create a reference which increases in ascending order
        // Something like this accountholder: Jada Bailey AccountNumber: 2024+44CUR100JB -> year opened; country of bank; type of bank; int ref; user initials;
         

     
       
        
     
    

    


    
}
