package designPatterns;

public interface InterfaceOne {

    default String name(){
        System.out.println("My name is Apurva");
        return "Apurva";
    };
}
