package com.yousuf.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int temp;
		System.out.print("How many array you want to input: ");
		int n = in.nextInt();
		System.out.println("  ");
		System.out.println("Now Enter the "+n+" Element: ");
		System.out.println("  ");
		
		int[]  a = new int[n];
		
		for(int i = 0; i<n; i++) {
			
			a[i]= in.nextInt();
			
		}
		
	
		System.out.println("-----------------------------------");
		System.out.println("Before Sorting");
		System.out.println("  ");
		System.out.println(Arrays.toString(a));
		
		// Bubble sort starting 
		for(int i = 0; i<n-1; i++) {
			
			for(int j = 0; j<n-i-1; j++) {
				
				if(a[j]>a[j+1]) {
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					 
				}
				
			}
			
		}
		System.out.println(" ");
		System.out.println("-----After Sorting Array-----");
		System.out.println(" ");
		System.out.println(Arrays.toString(a));
	}

}
