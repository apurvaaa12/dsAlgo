package designPatterns;

public interface InterfaceTwo {

    default int age(){
        System.out.println("Im 25 years old");
        return 25;
    };

    static int futureAge() {
        return 100;
    }
}
