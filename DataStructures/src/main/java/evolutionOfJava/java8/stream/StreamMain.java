package evolutionOfJava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Goldman", "Sachs", "Interview", "Preparation");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .filter(name -> name.startsWith("G"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
