package com.cbfacademy;

public class Year {

    public static boolean isLeap(int n)
    {
        if(n%400==0){
            return true;
        } else if (n%100 == 0 && n%400 !=0) {
            return false;
        } else if (n%4 == 0 && n%100 !=0){
            return true;
        } // else
        {
            return false;
        }
     }


}
