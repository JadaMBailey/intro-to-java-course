package com.cbfacademy;

import java.util.Scanner;
import java.util.UUID;

import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.Bank;
import com.cbfacademy.accounts.Client;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();
        input.nextLine();
            }


    public App(int accountNumber, double balance, Scanner input) {
        this.input = input;
    }


    public void openCurrent(CurrentAccount opCurrentAccount){
        

      Client jBailey = new Client("Jada", "Bailey", "Jbkoala", 123456);
        jBailey.c1;
        // Need to find out why I can't input instance variable in place. We will run with it.
     // need to research how to 
        // create an current account object without assigning variable name, 

     
        // I think I will need to add another constructor in Current Account class excluding account number, as client will not no that to input
        
     // this.accountNumber = Integer.parseInt((UUID.randomUUID().toString().replace("-", "")));
      // Need to research what the UUID class is compared to Math class
    }

    public void openSaver(SavingsAccount openSaver){
        // need to create an instance from Savings Account in this method
    }


    
}
