package evolutionOfJava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//   map()              	           flatMap()
//Converts elements  	        Flattens and converts
//Stream<T>	                    Stream<R> (flattened structure)
//Transform elements one-to-one	Transform and merge multiple lists
public class MapVsFlatMap {
    public static void main(String[] ags) {
        List<String> words = Arrays.asList("Hello", "World");

        //using Map
        List<List<Character>> mapped = words.stream().map(word -> word.chars().mapToObj(c -> (char) c).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(mapped); // [[H, e, l, l, o], [W, o, r, l, d]]


        //FlatMap
        List<Character> flatMapped = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
        System.out.println(flatMapped); // [H, e, l, l, o, W, o, r, l, d]

        List<Customer> customers = EkartDataBase.getAll();

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
