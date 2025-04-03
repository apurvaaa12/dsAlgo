package evolutionOfJava.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierDemo {
    public static void main(String[] args){
        Supplier<String> supplier = () -> {return "My name is Apurva";};
        System.out.println(supplier.get());

//        List<String> list = Arrays.asList("A","B","C");
        List<String> list = Arrays.asList();
        //finding if the list is empty then returning a supplier
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
