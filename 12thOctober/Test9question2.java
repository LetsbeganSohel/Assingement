package Private.Ltd;
import java.util.Scanner;
public class Test9question2 {
	 static int n  ;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			do {
				System.out.println("enter the 1st number");
				int i=sc.nextInt();
				System.out.println("enter the second number");
				int j=sc.nextInt();
				 System.out.println(i+j);
				System.out.println("Enter your choise" +" press 0 for continue and any to escape");
				 n=sc.nextInt();
			}while(n==0);
		
	}

}
