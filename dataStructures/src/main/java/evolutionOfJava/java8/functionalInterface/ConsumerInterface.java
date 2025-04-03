package evolutionOfJava.java8.functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerInterface implements Consumer {
//    public static void main(String[] args){
//
//    }
//
//    @Override
//    public void accept(Object o) {
//        System.out.println("printing it: " +o);
//    }
//} Traditional way

public class ConsumerInterface {
    public static void main(String[] args){
        Consumer<Object> consumer = (o) -> {
                System.out.println("printing it: " +o);
        };

        consumer.accept("10");

        List<Integer> list = Arrays.asList(1,2,2,3,4);
        list.forEach(System.out::println);
        list.forEach(consumer);
    }
}