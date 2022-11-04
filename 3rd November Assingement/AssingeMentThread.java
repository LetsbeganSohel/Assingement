package Threads.com;
import java.util.ArrayList;
 class LoaderThread extends Threads{
	 ListLoader Lb;
	 LoaderThread(int startNumber, int lastNumber){
		this.Lb=Lb;
	 
	 }
	@Override
	public void run() {
	Lb.loadList (0,5000000); 
		
	}
}
 class MainThread extends Thread{
	 ListLoader Lb;
	 MainThread (int startNumber, int lastNumber){
		 this.Lb=Lb;
	 }
	 @Override
	 public void run() {
		 Lb.loadList(0,5000000);
	 }
 }
class ListLoader  {
	 void loadList (int startNumber, int lastNumber){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=startNumber;i<=lastNumber;i++) {
			arr.add(i);
	 }
	 }
}
public class AssingeMentThread {

	public static void main(String[] args) {
		 ListLoader  L1= new  ListLoader ();
		 int a = (int) System.currentTimeMillis();
		System.out.println( a);
		 L1.loadList(1, 10000000);
		 int b= (int)System.currentTimeMillis();
		 System.out.println( b);
		 System.out.println("Difference Time is :"+   (b-a));
		 LoaderThread Lb=new LoaderThread();
		 

	}

}
