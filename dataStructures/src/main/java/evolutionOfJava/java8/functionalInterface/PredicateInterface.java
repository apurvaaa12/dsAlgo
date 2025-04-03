package evolutionOfJava.java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {


    public static void main(String[] args){
//        Predicate<Integer> predicate = new PredicateInterface();
//        System.out.println(predicate.test(3));

        Predicate<Integer> test = (t) -> {
            if (t % 2 == 0) {
            return true;
        } else {
            return false;
        }};

        System.out.println(test.test(2));

        Predicate<Integer> example = t -> t%2 ==0;
        System.out.println(example.test(9));
    }

//    @Override
//    public boolean test(Integer integer) {
//        if (integer % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
