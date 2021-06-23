package com.sandeep.sorting;

public class insertionSort {
    static void insertionSortImpl(int [] array){
        //23,43,5,12,78
        for(int i=1;i<array.length;i++){
            int j = i -1;
            int element = array[i];
            while(j>=0 && array[j] > element){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = element;
        }
    }
    public static void main(String[] args) {
        int [] array = new int[]{23,43,5,12,78};
        insertionSortImpl(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
