package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        concatenate("hello ","have a wonderful ", "day!");
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
        return word1 + word2 + word3;
        // Other option1: return word1.concat(word2).concat(word3);
        // Other option2: return String.join(delimiter:"", word1, word2, word3);
       // throw new RuntimeException("Not implemented");
    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
       // throw new RuntimeException("Not implemented");
        return word1.areEqual(word2);
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        //throw new RuntimeException("Not implemented");
        return String.format("Item: %s. Quantity: %d. Price: £%.2f.", item, price, quantity);
        
        //"Item: " + item.format;
        //"Price: " + price.format;
        //"Quality: " + quantity.format;
        

    }
}
