package evolutionOfJava.java8.stream;

import java.util.Optional;

//Optional<T> prevents NullPointerException by providing a null-safe way to handle missing values.
public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);

        // Using `orElse()`
        System.out.println(optionalValue.orElse("Default Value")); // Output: Default Value

// Using `ifPresent()`
        optionalValue.ifPresent(value -> System.out.println("Value is: " + value));
    }
}
