package collectors;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void show() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("a", 10, Genre.ACTION));
		movies.add(new Movie("b", 15, Genre.COMEDY));
		movies.add(new Movie("c", 15, Genre.THRILLER));
		movies.add(new Movie("d", 20, Genre.COMEDY));
		movies.add(new Movie("e", 28, Genre.ACTION));

		// Collectors : List
		List<Movie> moreThan20 = movies.stream().filter(m -> m.getLike() > 10).collect(Collectors.toList());

		System.out.println(moreThan20);

		System.out.println("---------------------------");

		// Collectors: Set

		Set<Movie> setMoreThan20 = movies.stream().filter(m -> m.getLike() > 10).collect(Collectors.toSet());

		System.out.println(setMoreThan20);

		System.out.println("---------------------------");

		// Collectors : Map

		Map<String, Integer> mapMoreThan20 = movies.stream().filter(m -> m.getLike() > 10)
				.collect(Collectors.toMap(Movie::getTitle, Movie::getLike));

		System.out.println(mapMoreThan20);

		System.out.println("---------------------------");

		// Collectors : SummingInt
		IntSummaryStatistics summing = movies.stream().filter(m -> m.getLike() > 10)
				.collect(Collectors.summarizingInt(Movie::getLike));

		System.out.println(summing);

		System.out.println("---------------------------");

		// Collectors : Joining
		String joining = movies.stream().filter(m -> m.getLike() > 10).map(Movie::getTitle)
				.collect(Collectors.joining(" , "));
		System.out.println(joining);

		System.out.println("---------------------------");
		// Collectors : Groping By
		Map<Object, String> groupingBy = movies.stream().filter(m -> m.getLike() > 10).collect(
				Collectors.groupingBy(m -> m.getGenre(), Collectors.mapping(Movie::getTitle, Collectors.joining(","))));

		System.out.println(groupingBy);

		System.out.println("---------------------------");

		// Collectors : Groping By With Collectors.counting
		Map<Object, Long> groupingByCounting = movies.stream().filter(m -> m.getLike() > 10)
				.collect(Collectors.groupingBy(m -> m.getGenre(), Collectors.counting()));

		System.out.println(groupingByCounting);

		System.out.println("---------------------------");

		// Collectors : Partitioning By
		Map<Boolean, List<Movie>> partitioningBy = movies.stream().filter(m -> m.getLike() > 10)
				.collect(Collectors.partitioningBy(m -> m.getLike() > 20));

		System.out.println(partitioningBy);

		System.out.println("---------------------------");
		
		// Collectors : Partitioning By With Mapping and Collectors.joining
		Map<Boolean, String> partitioningByMapping = movies.stream().filter(m -> m.getLike() > 10)
				.collect(Collectors.partitioningBy(m -> m.getLike() > 20,
						Collectors.mapping(Movie::getTitle, Collectors.joining(","))));

		System.out.println(partitioningByMapping);
		
	}

}
