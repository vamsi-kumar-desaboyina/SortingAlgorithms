package com.bubblesort;

//Modify Bubble Sort to sort the array in descending order.
import java.util.*;
public class BubbleSortDescendingOrder {
public static void main(String[] args) {
    int[] arr={1,2,3,6,9,-2,4,5};
    for(int i=0;i<arr.length-1;i++)
    {
        boolean swap=false;
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]<arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=true;
            }
        }
        System.out.println(Arrays.toString(arr));
        if(!swap) break;
    }
    System.out.println(Arrays.toString(arr));
}
}