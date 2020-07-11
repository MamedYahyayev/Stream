package creatingstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void show() {
		// Create Stream With List
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().forEach(n -> System.out.println(n));
		;

		System.out.println("---------------------");

		// Create Stream With Array
		int[] numbers = { 1, 2, 3 };
		Arrays.stream(numbers).forEach(i -> System.out.println(i));
		;

		System.out.println("--------------------------");

		// Create Stream Arbitrary Number of Objects
		Stream<Double> stream = Stream.generate(() -> Math.random());
		stream.limit(5).forEach(i -> System.out.println(i));

		System.out.println("---------------------------");

		// Create Stream With Infinite
		Stream.iterate(1, n -> n + 1).limit(15).forEach(n -> System.out.println(n));

	}

}
