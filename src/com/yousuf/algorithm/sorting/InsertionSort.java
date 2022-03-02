package com.yousuf.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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
	  
	  System.out.println("-------------------------------");
	 
      System.out.print("Element in the Array: "+Arrays.toString(array));
      System.out.println(" ");
      int temp,j;
      
      for(int i = 1 ; i<n; i++) {
    	  
    	  temp = array[i];
    	   j = i - 1;
    	   
    	   while(j>=0 && array[j]> temp) {
    		   
    		     array[j+1] = array[j];
    		     j--;                   // j = j -1;
    		   
    	   }
    	   
    	   array[j+1] = temp; 
    	  
      }	
      System.out.println("-------------------------------");
      System.out.print("Sorted Array: "+Arrays.toString(array));
      
		

	}

}
