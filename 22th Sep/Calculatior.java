//2. Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading.

package Private.Ltd;

public class Calculatior {
	static void Addition(int a, int b, int p) {
		int c= a+b+p;
		System.out.println( "The Sum is " +c);
		
	}
	static void Substracion(int a, int b) {
		int d=a-b;
		System.out.println("The substraction is " +d);
		
	}
	static void Multiplication( int a, int b, int c, int d) {
		int f=a*b*c*d;
		System.out.println("The multiplication is " +f);
		
	}
	 static void Division( int a, int v) {
		int D= a%v;
		int s= a/v;
		System.out.println(" the reminder is " +D);
		System.out.println(" The Divisor is "+ s);
		
	}

	public static void main(String[] args) {
//		Calculatior cla= new Calculatior();
		 Calculatior.Addition(8,9, 4);
		 Calculatior.Substracion(12,7);
		 Calculatior.Multiplication(4, 6, 7, 3);
		 Calculatior.Division(13, 2);
		
	}

}
