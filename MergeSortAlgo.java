package com.sandeep.sorting;

public class MergeSortAlgo {
    static void sort(int [] array){
        mergeSort(array, 0 , array.length-1);
    }
    static void mergeSort(int [] array , int start , int end){
        int mid = (start + end)/2;
        if(end <= start){
             return;
        }
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,end,mid);
    }

    static void merge(int [] array, int start , int end, int mid){
        int leftSlot = start;
        int rightSlot = mid +1;
        int k=0;
        int [] tempArray = new int[end - start +1];
        while(leftSlot <= mid && rightSlot <= end){
            if(array[leftSlot] < array[rightSlot]){
                tempArray[k]=array[leftSlot];
                leftSlot=leftSlot+1;
            }else{
                tempArray[k]=array[rightSlot];
                rightSlot=rightSlot+1;
            }
            k=k+1;
        }

        if(leftSlot <= mid){
            while(leftSlot <= mid){
                tempArray[k]= array[leftSlot];
                leftSlot=leftSlot+1;
                k=k+1;
            }
        }
        if(rightSlot <= end){
            while(rightSlot<=end){
                tempArray[k]=array[rightSlot];
                rightSlot=rightSlot+1;
                k=k+1;
            }
        }

        for(int i=0;i<tempArray.length;i++){
            array[start+i]= tempArray[i];
        }
    }
    public static void main(String[] args) {
        int [] array = new int[]{34,23,12,45,56,1,99};
        sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
