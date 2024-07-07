package com.cbfacademy.sort;

public class VisualQuickSort extends QuickSort {
    /**
     * Sorts an array using the Quicksort algorithm, displaying the state of the
     * array with pointers for boundary, pivot and current indices.
     * 
     * @param arr        The array to be sorted.
     * @param startIndex The index of the first element in the array.
     * @param endIndex   The index of the last element in the array.
     */
    @Override
    public int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex - 1;

        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            display(arr, startIndex, endIndex, boundaryIndex, endIndex, currentIndex);

            if (arr[currentIndex] <= pivot) {
                boundaryIndex = boundaryIndex + 1;
                swap(arr, boundaryIndex, currentIndex);
                display(arr, startIndex, endIndex, boundaryIndex, endIndex, currentIndex);
            }
        }

        boundaryIndex = boundaryIndex + 1;
        swap(arr, boundaryIndex, endIndex);
        display(arr, startIndex, endIndex, -2, boundaryIndex, -1);

        return boundaryIndex;
    }

    /**
     * Displays visual state of array with pointers, e.g.
     * <pre>
     * B              P
     *[5 3 8 4 2 7 1 6]
     * C
     * 
     *B = boundary index
     *P = pivot index
     *C = current index
     * </pre>
     * 
     * @param arr           The array to be sorted.
     * @param startIndex    The index of the first element in the array.
     * @param endIndex      The index of the last element in the array.
     * @param boundaryIndex The index of the element representing the boundary of
     *                      the lower partition.
     * @param pivotIndex    The index of the pivot element.
     * @param currentIndex  The index of the current element.
     */
    private void display(int[] arr, int startIndex, int endIndex, int boundaryIndex, int pivotIndex,
            int currentIndex) {
        if (startIndex < 0 || endIndex >= arr.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid indices provided.");
        }

        StringBuilder arrayDisplay = new StringBuilder("[");
        for (int i = startIndex; i <= endIndex; i++) {
            arrayDisplay.append(arr[i]);
            if (i < endIndex) {
                arrayDisplay.append(" ");
            }
        }
        arrayDisplay.append("]");

        StringBuilder indicesLine = new StringBuilder();
        if (boundaryIndex == startIndex - 1) {
            indicesLine.append("B");
        } else {
            indicesLine.append(" ");
        }
        for (int i = startIndex; i <= endIndex + 1; i++) {
            if (i == boundaryIndex) {
                indicesLine.append("B");
            } else if (i == pivotIndex) {
                indicesLine.append("P");
            } else {
                indicesLine.append(" ");
            }
            if (i < endIndex) {
                indicesLine.append(" ");
            }
        }

        StringBuilder currentIndexLine = new StringBuilder();
        currentIndexLine.append(" ");
        for (int i = startIndex; i <= endIndex; i++) {
            if (i == currentIndex) {
                currentIndexLine.append("C");
            } else {
                currentIndexLine.append(" ");
            }
            if (i < endIndex) {
                currentIndexLine.append(" ");
            }
        }

        // Print the lines
        System.out.println(indicesLine.toString());
        System.out.println(arrayDisplay.toString());
        System.out.println(currentIndexLine.toString());
        System.out.println();
    }
}