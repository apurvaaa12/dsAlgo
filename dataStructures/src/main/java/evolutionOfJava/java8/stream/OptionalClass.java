package evolutionOfJava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//Optional<T> prevents NullPointerException by providing a null-safe way to handle missing values.
public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);

        // Using `orElse()`
        System.out.println(optionalValue.orElse("Default Value")); // Output: Default Value

// Using `ifPresent()`
        optionalValue.ifPresent(value -> System.out.println("Value is: " + value));

        Customer customer = new Customer(1,"Apurva",null, Arrays.asList("123","234"));

        //empty
        //of
        //nullable

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

//        Optional<String> optional = Optional.of(customer.getEmail());
//        System.out.println(optional); //null pointer exception // if object is never null

        Optional<String> optionOf = Optional.ofNullable(customer.getEmail());
        System.out.println(optionOf);

        if(optionOf.isPresent()){
            System.out.println(optionOf.get());
        }

//        public static Customer getCustomerByEmailId(String email) throws Exception {
//            List<Customer> customers = EkartDataBase.getAll();
//            return customers.stream()
//                    .filter(customer -> customer.getEmail().equals(email))
//                    .findAny().orElseThrow(()->new Exception("no customer present with this email id"));
//
//        }
    }
}
