package com.cbfacademy.sort;

import java.util.ArrayList;

// 
public class QuickSort implements ArraySorter{
    
    // public static void main(String[] args){
    //    // sort([1,4,6,9,2,5,6,8], 0, 7);

    // }

    
    public void sort(int[] arr, int startIndex, int endIndex)
    {
        if(startIndex < endIndex){
           
           int pivotIndex = partition(arr, startIndex, endIndex);
            
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
            // Recursion: call the same function by itself - calling sort method inside sort method
        }

    }
    // int arg[] = [2,5,8,1,3,7,9,10];
                //  0,1,2,3,4,5,6,7


    public int partition(int[] arr, int startIndex, int endIndex){
       int pivot = arr[endIndex];
       // wondering if this endIndex will change, as it is not wrriten as int pivot = endindex;
      int boundaryIndex = startIndex - 1;
      // I should not pass that point
        for(int i = startIndex; i < endIndex; i++){
            if (arr[i] <= pivot){
                boundaryIndex = boundaryIndex + 1;
                swap(arr, boundaryIndex, i);
            }
        }
        swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1;
      // for currentIndex = startIndex to endIndex - 1
    }

    public void swap(int[] arr, int leftIndex, int rightIndex){
       int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }

    
}
// can pass a method by assigning to a variable (look at line 18)
// 