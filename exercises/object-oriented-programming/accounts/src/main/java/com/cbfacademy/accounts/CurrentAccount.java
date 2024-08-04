package com.cbfacademy.accounts;

public class CurrentAccount extends Account{

    protected double overdraftLimit;

    // automatically assume it's going to be private or protected

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit, String accountType){
       super(accountNumber,balance, accountType);
       this.overdraftLimit = overdraftLimit;
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
    if ((this.balance + this.overdraftLimit) < requested){
        return 0;
         
    }else {
        balance -= requested;
        return requested;
    }
    }


}
