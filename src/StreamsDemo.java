import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		// Imperative Programming
		int count = 0;
		for (Movie movie : movies) {
			if (movie.getLike() > 10)
				count++;
		}

		// Declarative (Functional) Programming
		long countWithStream = movies.stream()
									.filter(movie -> movie.getLike() > 10)
									.count();

		System.out.println("Count with Imperative Programming : " + count);
		System.out.println("Count with Declarative Programming : " + countWithStream);
		
		
	
		
		
		
	}

}
