package com.yousuf.algorithm.searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean flag = false;
		int i = 0;
		
		System.out.print("Enter the array size: ");
		int size = input.nextInt();
		int[] array = new int[size];
		
		System.out.println("  ");
		System.out.println("--------------------------");
		System.out.println("Now Enter The "+size+" Element.");
		System.out.println("  ");
		
        for( i = 0;i<size;i++) {
    		
    	  System.out.print("Enter the "+(i+1)+" element: ");
		  array[i]=input.nextInt();
			
		}
  	    System.out.println("  ");
	    System.out.println("--------------------------");
		System.out.print("Enter element to Search: ");
		
		int search = input.nextInt();
		
		    System.out.println("  ");
		    System.out.println("--------------------------");
		for( i = 0; i<size; i++) {
			
			if(array[i] == search) {
				
				System.out.println("Element found: "+search);
				System.out.println("Element found at index: "+(i + 1));
				flag=true;
				break;
				
			}
			
		}
		
		if(flag == false) {
			
			System.out.println("Element not Found");
			
		}
		

	}

}
