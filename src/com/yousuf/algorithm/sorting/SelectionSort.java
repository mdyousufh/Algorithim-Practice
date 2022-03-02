package com.yousuf.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the array Size: ");
		
		int n = input.nextInt();
		int[] array = new int[n];
		
		System.out.println("-------------------------------");
		for(int i = 0; i<n; i++) {
		    System.out.print("Enter the "+(i+1)+" Element: ");
			array[i] = input.nextInt();
			
		}
      
		
	  System.out.println(" ");
	  System.out.println("-------------------------------");
	
      System.out.print("Element in the Array: "+Arrays.toString(array));
      
      
      for(int i = 0; i<n-1; i++) {
    	  
    	  int min = i;
    	  
    	  for(int j = i+1; j<n; j++) {
    		  
    		  if(array[j]<array[min]) {
    			  
    			  min = j;
    			  
    		  }
    		  
    		int temp = array[min];
    		array[min] = array[i];
    		array[i] = temp;
    	  }
      }
      System.out.println(" ");
      System.out.println("-------------------------------");
      System.out.println("Sorted array: "+Arrays.toString(array));

	}

}
