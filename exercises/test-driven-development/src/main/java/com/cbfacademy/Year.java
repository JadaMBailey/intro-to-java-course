package com.cbfacademy;

public class Year {

    public boolean isLeap(int n, int w){
        if(n%400==0){
            return false;
        } else if (n%100 == 0) {
            return true;
        } else if (n%4 == 0){
            return true;
        } else if (n % 4 !=0)
        {
            return false;
        }
        return true; 
    }


}
