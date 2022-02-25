package com.yousuf.algorithm.searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		System.out.print("Enter the number of Array Size: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		System.out.println("--------------------------");
		System.out.println("Enter the "+n+" Element.");
		System.out.println("--------------------------");
		
		for(int i = 0; i<n; i++) {
			
	    System.out.print("Enter the "+(i+1)+" Element: ");
	    array[i] = in.nextInt();
	    
			
		}
		
		int l,r,mid,data;
		l = 0;
		r = n -1;
		System.out.println(" ");
		System.out.print("Enter the search value:  ");
		data = in.nextInt();
		in.close();
		
		mid = (l+r)/2;
		
		while(l<=r) {
			
			if(data == array[mid]) {
				System.out.println("--------------------------");
				System.out.println("Element found: "+data);
				System.out.println("Element found at index: "+mid);
				break;
				
			}
			
			else if(data>array[mid]) {
				l = mid+1;
				
			}
			else if(data<array[mid]) {
				r = mid-1;
				
			}
			
			mid = (l+r)/2;
			
		}
	
	    if(l>r) {
	    	System.out.println("--------------------------");
	    	System.out.println("Element not found.");
	    	
	    }
		

	}

}
