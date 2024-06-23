package com.cbfacademy;

import java.util.Scanner;
import java.util.UUID;

import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.Bank;
import com.cbfacademy.accounts.Client;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;

public class App 
{
    Scanner input = new Scanner(System.in);
    input.nextInt(); // nextInt() - 
    input.nextLine(); // nextLine() - 
    public static void main(String[] args) {
            Bank jBailey = new Bank(accountNumber, 1000);

            }


    public App(int accountNumber, double balance, Scanner input) {
        this.input = input;
    }


    public void openCurrent(CurrentAccount opCurrentAccount){
        

      Client jBailey = new Client("Jada", "Bailey", "Jbkoala", 123456);
        jBailey.c1;
        // Need to find out why I can't input instance variable in place. 
     
        // Need to know how to create an current account object without assigning variable name to it, or create a reference which increases in ascending order
        // Something like this accountholder: Jada Bailey AccountNumber: 2024+44CUR100JB -> year opened; country of bank; type of bank; int ref; user initials;
         

     
       
        
     // this.accountNumber = Integer.parseInt((UUID.randomUUID().toString().replace("-", "")));
      // Need to research what the UUID class is compared to Math class
    }

    public void openSaver(SavingsAccount openSaver){
        // need to create an instance from Savings Account in this method
    }


    
}
