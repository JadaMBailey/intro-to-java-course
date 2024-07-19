package com.cbfacademy.sort;

/**
 * BubbleSort
 */
public class BubbleSort {

    public int bubbleSort(int[] arrayB){
        int left = 0;
        int right = left + 1;
        for(int a: arrayB) {
            if(arrayB[left] > arrayB[right]){
                arrayB[left] += 1;
                arrayB[right] -= 1;
            } else{
                // arrayB[left] <= arrayB[right]
                left += 1;
                right += 1;
            }
           
        }
        return 0; 

    }



}