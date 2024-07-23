package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {


    public  List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<String>();
        // abstract class on the left (List)
        // I am storing all variables in 'result' variable

        for(int i = 0; i < numbers.size(); i++) {

        if (numbers.get(i) % 5 == 0 && numbers.get(i) % 3 ==0){
            result.add("FizzBuzz");

        } else if (numbers.get(i) % 3 == 0){
            // get() is used instead of [] because of collection Framework (it is not an Array)
            result.add("Fizz"); 

        } else if (numbers.get(i) % 5 == 0){
            result.add("Buzz");

        }else {
                result.add(numbers.get(i).toString());
            }
            
        }
        return result;
       // throw new RuntimeException("Not implemented");

        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the output corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid output number"
        // throw new RuntimeException("Not implemented");
        // Andrew said to use Switch statement

        String output;
        switch (number) {
            case 1:
               output = "January";
                break;
            case 2:
                 output = "February";
                break;
            case 3:
                 output ="March";
                break;
            case 4:
                output ="April";
                break;
            case 5:
                output ="May";
                break;
            case 6:
                output ="June";
                break;
            case 7:
                output ="July";
                break;
            case 8:
                output ="August";
                break;
            case 9:
                output ="September";
                break;
            case 10:
                output ="October";
                break;
            case 11:
                output ="November";
                break;
            case 12:
                output ="December";
                break;
            default:
             output = "Invalid month number";
        }
        return output;
    }
    

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // numbers = {1,2,3,4,5} -> {5,4,3,2,1} -> STACK System
       int right = numbers.size()-1;
       int left = 0;
       ArrayList<Integer> target;
       for(Integer num: numbers){
        // Link to help: https://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
       }
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
