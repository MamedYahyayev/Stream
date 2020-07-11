package reducers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10));
		movies.add(new Movie("b", 15));
		movies.add(new Movie("c", 20));

		// Count
		long count = movies.stream().count();
		System.out.println("Count: " + count);

		// Any Match
		boolean anyMatch = movies.stream().anyMatch(m -> m.getLike() > 10);
		System.out.println("AnyMatch : " + anyMatch);

		// All Match
		boolean allMatch = movies.stream().allMatch(m -> m.getLike() > 5);
		System.out.println("All Match : " + allMatch);

		// None Match
		boolean noneMatch = movies.stream().noneMatch(m -> m.getLike() > 45);
		System.out.println("None Match : " + noneMatch);

		// Find First
		Movie findFirst = movies.stream().findFirst().get();
		System.out.println("Find First : " + findFirst.getTitle());

		// Find Any
		Movie findAny = movies.stream().findAny().get();
		System.out.println("Find Any : " + findAny.getTitle());

		// Max
		Movie movieMax = movies.stream().max(Comparator.comparing(Movie::getLike)).get();
		System.out.println("Max :" + movieMax.getTitle());

		// Min
		Movie movieMin = movies.stream().min(Comparator.comparing(Movie::getLike)).get();
		System.out.println("Min :" + movieMin.getTitle());

	}

}
