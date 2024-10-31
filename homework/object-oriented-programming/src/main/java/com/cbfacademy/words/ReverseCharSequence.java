package com.cbfacademy.words;
import java.lang.CharSequence;

public class ReverseCharSequence implements CharSequence {
    private String original;

    public static void main(String[] args) {
        ReverseCharSequence tester = new ReverseCharSequence("Bailey");

       char x = tester.charAt(3);
       int y = tester.length();
       CharSequence z = tester.subSequence(0, 6);
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
    }

    public ReverseCharSequence(String original){
        this.original = original;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder reversedSub = new StringBuilder(original.substring(start, end)).reverse();
        return reversedSub.toString();
    }


}