package evolutionOfJava.java21;

public class PatternMatchingForSwitch {
    public static void main(String[] args){
//        Object obj = "Hello, World!";
        Object obj = 100;
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s  -> System.out.println("String: " + s);
            default        -> System.out.println("Unknown type");
        }
    }
}
