package mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);

		// Map
		movies.stream()
			.map(movie -> movie.getTitle().equals("a"))
			.forEach(movie -> System.out.println(movie));
		
		
		
		// Flat Map
		Stream<List<?>> stream =  Stream.of(numbers, numbers);
		stream.flatMap(n -> n.stream())
				.forEach(n -> System.out.println(n));
		

	}

}
