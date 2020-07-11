package slicing;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		// Limit
		movies.stream().limit(2).forEach(movie -> System.out.println(movie.getTitle()));
		
		System.out.println("---");
		//Skip
		movies.stream().skip(2).forEach(movie -> System.out.println(movie.getTitle()));
		
		System.out.println("---");
		// Skip And Limit
		movies.stream().skip(1).limit(2).forEach(movie -> System.out.println(movie.getTitle()));
		
		
		
		
	}

}
