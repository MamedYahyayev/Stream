package primitivetypestreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsDemo {

	public static void show() {

		System.out.println("IntStream.of");
		IntStream.of(1, 2, 3, 4).forEach(System.out::println);

		System.out.println("DoubleStream.of");
		DoubleStream.of(1, 2, 3, 4).forEach(System.out::println);

		System.out.println("LongStream.of");
		LongStream.of(1, 2, 3, 4).forEach(System.out::println);

		System.out.println("IntStream.range");
		IntStream.range(1, 3).forEach(System.out::println);

		System.out.println("LongStream.range");
		LongStream.range(1, 3).forEach(System.out::println);

		System.out.println("IntStream.rangeClosed");
		IntStream.rangeClosed(1, 3).forEach(System.out::println);

		System.out.println("LongStream.rangeClosed");
		LongStream.rangeClosed(1, 3).forEach(System.out::println);

	}

}
