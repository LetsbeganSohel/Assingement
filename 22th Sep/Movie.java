// 4.Movie Theatre Management System, where you can create two classes one is main another one is movie, 
//movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.


package Private.Ltd;


class Movie2{
	private String movieName;
	private float movieStartTime=3.15f;
	private float movieEndTime=6.42f;
	 private int MovieTicketPrice=230;
	public String getMovie() {
		return movieName+" " +  movieStartTime+" " +movieEndTime+" " +MovieTicketPrice;
		
		
	}
	 public void  setMovie(String Name,float EndTime, float StaratTime, int Price) {
		this.movieName=Name;
		this.movieStartTime=StaratTime;
		this.movieEndTime=EndTime;
		this.MovieTicketPrice=Price;
			
		
	}
	
}

public class Movie extends Movie2{

	public static void main(String[] args) {
		Movie2 M1= new Movie2();
		M1.setMovie("Avatar",6.15f,2.45f,250);
		System.out.println(M1.getMovie());
		
		

	}

}
