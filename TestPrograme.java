package Private.Ltd;

public class TestPrograme {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=200;i++) {
			if(i%5==0 || i%7==0 && (i%5==0 && i%7==0)) {
				System.out.println(i);
			}
			
		}

	}

}
