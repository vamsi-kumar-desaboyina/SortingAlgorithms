package com.selectionsort;

import java.util.Arrays;

public class AlgorithmSelectionSort {
	public static void main(String[] args) {
        int[] arr={4,2,1};
        for(int i=0;i<arr.length-1;i++)
        {
            int max=arr[0];
            int index=0;
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    index=j;
                }
            }
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[index];
            arr[index]=temp;
           // System.out.println(Arrays.toString(arr));
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
