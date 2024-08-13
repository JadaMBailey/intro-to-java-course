package com.cbfacademy.accounts;

public class CurrentAccount extends Account{

    private double overdraftLimit;
    // automatically assume it's going to be private or protected

    public CurrentAccount(int accountNumber, double balance, String accountType){
       super(balance);
       if(balance > 1000){
        this.setOverdraftLimit(1000);
       }
    }
 
    public CurrentAccount(int accountNumber,double balance){
        super(accountNumber, balance);

    }
    
    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double newOverdraftLimit){
      if(newOverdraftLimit >= 0){
        this.overdraftLimit = newOverdraftLimit;
      }
      
    }

    @Override
    public double withdraw(double requested){
        // This method checks whether there is sufficient funds to make the necessary withdrawal
    if ((getBalance() + this.overdraftLimit) < requested){
        return 0;
         
    }else {
      double returnFunds = getBalance() - requested;
        return returnFunds;
    }
    }


}
