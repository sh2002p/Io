package com.rays.exercise;

public class Question6 {
	public static void main(String[] args) {
		int number = 9;
		int r;
		int sum = 0;
		int n = number;
		while (n<0);
		
		r=n %10;
		sum = (sum *10)+ r;
	
	if (sum == number) {
		System.out.println("palindrome number");	
	}else {
		System.out.println("not palindrome number");
	}

	}}
