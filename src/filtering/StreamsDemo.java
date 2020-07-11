package filtering;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		Predicate<Movie> isPopular = movie -> movie.getLike() > 10;
		movies.stream()
			.filter(isPopular)
			.forEach(movie -> System.out.println(movie.getTitle()));
		
	}

}
