// WAJP to get a number from the user and print whether it is positive or negative
package com.company;
import java.util.Scanner;

public class TocheckNegative {

	public static void main(String[] args) {
		
		Scanner nu=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=nu.nextInt();
		if(num<0) {
			System.out.println(num + "This is a negative number");
		}
		else if(num>0) {
			System.out.println(num+  "This  is a positive number");
		}
		else {
			System.out.println("This is " +num);
		}
		

	}

}
