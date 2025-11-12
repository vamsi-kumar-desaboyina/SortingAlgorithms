package com.bubblesort;

//bubble sort
import java.util.*;
class BubbleSort {
  public static void main(String[] args) {
      int[] arr={1,2,3,6,9,-2,4,5};
      for(int i=0;i<arr.length-1;i++)
      {
          boolean swap=false;
          for(int j=0;j<arr.length-i-1;j++)
          {
              if(arr[j]>arr[j+1])
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
//🧩 Algorithm: Bubble Sort
//Idea

//Bubble Sort is a simple comparison-based sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.
//After each pass, the largest (or smallest) element “bubbles up” to its correct position.

//Algorithm Steps

//Start from the beginning of the array.

//Compare adjacent elements arr[j] and arr[j+1].

//If they are in the wrong order, swap them.

//Continue this for all pairs until the end of the array.

//Repeat steps 1–4 for n-1 passes or until no swaps are needed (meaning the array is sorted).

//Pseudocode
//for (i = 0; i < n-1; i++) {
//  swapped = false;
//  for (j = 0; j < n-i-1; j++) {
//      if (arr[j] > arr[j+1]) {
//          swap(arr[j], arr[j+1]);
//          swapped = true;
//      }
//  }
//  if (!swapped) break; // Optimization: stop early if sorted
//}

//⚙️ Use Case

//When simplicity is preferred over performance

//Good for small arrays (like ≤ 20 elements).

//Useful for educational purposes — helps understand sorting basics.

//Sometimes used where data is already nearly sorted.

//Easy to implement when memory is very limited (in-place sorting).

//Example use:

//Teaching sorting concepts in programming courses.

//Sorting small data sets embedded in hardware or low-resource environments.

//⏱️ Time Complexity
//Case	        Description	             Comparisons	Time Complexity
//Best	        Array is already sorted	             n-1	O(n)
//Average	Random order	                    ~n²/2	O(n²)
//Worst	Reverse sorted	                     ~n²/2	O(n²)

//✅ The optimization using a swapped flag makes the best case O(n).

//💾 Space Complexity
//Type	Complexity	Reason
//Auxiliary Space	O(1)	Only uses a few extra variables (in-place sorting).
//Total Space	O(n)	Array storage itself.
//⚠️ Limitations / Disadvantages

//❌ Inefficient for large datasets

//Takes O(n²) time → very slow compared to efficient algorithms (like Quick Sort, Merge Sort, or Heap Sort).

//⚙️ Too many swaps

//Even for small unsorted arrays, performs many unnecessary swaps, which increases overhead.

//⚖️ Unstable performance

//Performs poorly when data is randomly distributed.

//🧠 Not suitable for real-world applications

//Almost never used in production systems; mostly for learning or demonstration.

//🧠 Comparison with Other Algorithms
//Algorithm	                Time (Average)	    Space	Stable	   Notes
//Bubble Sort          	O(n²)	            O(1)	✅	Very simple
//Insertion Sort	        O(n²)	            O(1)	✅	Better for nearly sorted arrays
//Selection Sort	        O(n²)	            O(1)	❌	Fewer swaps but not stable
//Merge Sort	                O(n log n)	    O(n)	✅	Very efficient, not in-place
//Quick Sort	                O(n log n)	    O(log n)	❌	Very fast in practice
//🧾 Summary
//Property	        Value
//Algorithm type	Comparison-based
//In-place	        ✅ Yes
//Stable	        ✅ Yes
//Best case	         O(n)
//Worst case	         O(n²)
//Space	          O(1)
//Use case	      Small or nearly sorted datasets
//Limitation	       Too slow for large inputs