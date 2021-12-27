package com.greatlearning.dsa;

import java.util.Scanner;


public class Transaction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Ask user to enter the size of the transaction array
		
		
		System.out.println("Please enter the size of the transaction array.");
		
		int arrSize = sc.nextInt();
		int array[]= new int [arrSize];
		
		
		
		
		//Enter the values of the array
		
		for (int i = 0; i < arrSize; i++) {
			System.out.println("Enter value of the transaction at position "+i);
			
			array[i]=sc.nextInt();
			
		}
		
		
		//Enter the number of targets to be achieved
		
		System.out.println("Please enter the number of targets to be achieved.");
		
		int targetCount = sc.nextInt();
		int target;
		
		//Check whether the target can be achieved. If the target cannot be achieved, then print the message saying given target is not achieved.
		
		for (int j = 1; j <=targetCount; j++) {
			
			boolean flag = false; 
			
			System.out.println("Please enter the target");
			target = sc.nextInt();
			int sumValue = 0;
			
			
			for (int i = 0; i < arrSize; i++) {
				
				sumValue = sumValue+ array[i];
				//System.out.println("Sum value is "+sumValue);
				
				if (sumValue > target) {
					flag = true; 
					System.out.println("Target is achieved after "+ (i+1) + " transactions");
					break;
				}
					
			}
			
			if (flag == false) {
				System.out.println("Target could not be achieved");
				}
		}
		
		sc.close();
	}

}
