package com.sandeep.sorting;

public class Selection {
    static void linearSort(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] array = new int[]{34,23,12,45,56,1,99};
        linearSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
