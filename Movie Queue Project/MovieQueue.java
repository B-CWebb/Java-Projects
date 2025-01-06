import java.util.ArrayList;



public class MovieQueue {
	private ArrayList<Movie> movQ = new ArrayList<Movie>();
	int lastHorror;
	
	public void add(Movie movie) {
					if ((movie.getGenre()=="Horror") && (movQ.equals(null))){
				movQ.add(movie);
				lastHorror = 0;
			}
			else if ((movie.getGenre() == "Horror") && (lastHorror >= 0)) {
				lastHorror += 1;
				movQ.add(lastHorror, movie); }
			
			else {movQ.add(movie);
			}
		
	}
	
	public Movie remove() {
		if (movQ.equals(null)) {return null;}
		else {return movQ.remove(0);}
		
	}
}
