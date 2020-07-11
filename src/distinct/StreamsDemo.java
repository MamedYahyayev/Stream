package distinct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		//movies.stream().forEach(like -> System.out.println(like.getLike()));

		
		Stream<?> likes = movies.stream().map(movie -> movie.getLike());
		likes.distinct().forEach(like -> System.out.println(like));
		
	
	}

}
