package com.cbfacademy;

public class FizzBuzz {


        public static String getFizzBuzz(Integer n)
        {
             if(n%3 == 0 && n%5 == 0){
                 return "FizzBuzz";
             } else if (n%3 == 0){
               return "Fizz";
             } else if (n%5 == 0){
                 return "Buzz";
                } return n.toString();
                }

    }

    //     public static String getFizzBuzz(int n){
    //         if(n%3 == 0 && n%5 == 0){
    //             return "FizzBuzz";
    //         } else if (n%3 == 0){
    //             return "Fizz";
    //         } else if (n%5 == 0){
    //             return "Buzz";
    //         } else if (n == {1,2,4,7} && n != 0) {
    //             // I want to list all number and for it to output the same input
    //         } {
    //             return n;
    //         }
    // }
    

    // public static String getFizzBuzz(int n){
        
    //     switch (n)
    //     {
    //     case 1:
    //         return ("1");
            
    //     case 2:
    //         return ("2");
            
    //     case 3:
    //         return ("Fizz");
            
    //     case 4:
    //         return ("4");
            
    //     case 5:
    //         return ("Buzz");
            
    //     case 6:
    //         return ("Fizz");
            
    //     case 7:
    //         return ("7");
            
    //     case 8:
    //         return ("8");
            
    //     case 9:
    //         return ("Fizz");
            
    //     case 10:
    //         return ("Buzz");
            
    //     case 11:
    //         return ("11");
            
    //     case 12:
    //         return ("Fizz");
            
    //     case 13:
    //         return ("13");
            
    //     case 14:
    //         return ("14");
            
    //     case 15:
    //         return ("FizzBuzz");
            
    //     default:
    //         return ("Error");
    //     }
        
    // }
    


