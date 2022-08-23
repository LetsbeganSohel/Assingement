/// Write a java programe to solve quadratic equatioN


package com.company;
import java.util.Scanner;

public class QuadraticequatioN {

	public static void main(String[] args) {
		Scanner nu1=new Scanner(System.in);
		Scanner nu2=new Scanner(System.in);
		Scanner nu3=new Scanner(System.in);
		System.out.print("a=");
		int a=nu1.nextInt();
		System.out.print("b=");
		int b=nu2.nextInt();
		System.out.print("c=");
		int c=nu3.nextInt();
		double c1=Math.sqrt((b*b)-(4*a*c));
		double d=(-b-c1)/2*a;
		double d2=(-b+c1)/2*a;
		System.out.println("The negetive number is\t"  +d);
		System.out.println("The positive number is\t"  +d2);

	}

}
