package peeking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		
		
		movies.stream()
			.filter(m -> m.getLike() > 10)
			.peek(m -> System.out.println("filtered : " + m.getTitle()))
			.map(t -> t.getTitle())
			.peek(t -> System.out.println("mapped : " + t))
			.forEach(System.out::println);

	}

}
