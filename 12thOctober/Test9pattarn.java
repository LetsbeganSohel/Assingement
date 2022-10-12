package Private.Ltd;

public class Test9pattarn {

	public static void main(String[] args) {
		 int i,j,k;
		for( i=0;i<5;i++) {
			for( j=i+1;j>=1;j--) {
				System.out.print("  " +j);
			}
			for(k=2;k<=i+1;k++) {
				System.out.print("   "+k);
			}
			System.out.println();
		}
	}
}

