package evolutionOfJava.java8.stream;

import java.util.Arrays;
import java.util.List;

//forEach(): Unordered (may give different results in parallel streams).
//forEachOrdered(): Preserves insertion order in parallel streams.
public class ForEachForOrdered {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Parallel stream using forEach (unordered)
        numbers.parallelStream().forEach(num -> System.out.print(num + " "));
        // Output: 3 1 5 2 4 (Order may vary)

        // Using forEachOrdered (ordered)
        numbers.parallelStream().forEachOrdered(num -> System.out.print(num + " "));
        // Output: 1 2 3 4 5
    }
}
