package evolutionOfJava.java10;

import java.util.ArrayList;
import java.util.List;

public class VarInference {
    public static void main(String[] args){
        var list = new ArrayList<>();
        List<String> listTest = new ArrayList<>();
        list.add("Hi");
        list.add(1);
        list.add("Akshay");
        listTest.add("Hi");
        System.out.println(list);
    }
}
