package evolutionOfJava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//   map()              	           flatMap()
//Converts elements  	        Flattens and converts
//Stream<T>	                    Stream<R> (flattened structure)
//Transform elements one-to-one	Transform and merge multiple lists
public class MapVsFlatMap {
    public static void main(String[] ags){
        List<String> words = Arrays.asList("Hello", "World");

        //using Map
        List<List<Character>> mapped = words.stream().
                map(word -> word.chars().mapToObj(c -> (char) c).collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(mapped); // [[H, e, l, l, o], [W, o, r, l, d]]


        //FlatMap
        List<Character> flatMapped = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(flatMapped); // [H, e, l, l, o, W, o, r, l, d]
    }
}
