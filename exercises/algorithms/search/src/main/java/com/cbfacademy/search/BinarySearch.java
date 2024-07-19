package com.cbfacademy.search;

public class BinarySearch implements Search {

    public int search(int[] sortedArray, int target){
        int left = 0;
        int right = sortedArray.length - 1;
        int mid = (left + right) / 2;

       while(left <= right)
       {

        if(sortedArray[mid] == target){
            System.out.println("Found the target value, which was " + target);
            return mid; 
        } else if(sortedArray[mid] < target){
            left = mid + 1;
            mid = (left + right) /2;
        } else {
            // sortedArray[mid] > target
            right = mid - 1;
            mid = (left + right) / 2;
        } 
       }
       return -1;
    }

}