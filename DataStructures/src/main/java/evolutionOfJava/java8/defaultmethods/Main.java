package evolutionOfJava.java8.defaultmethods;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Fish fish = new Fish();

        dog.hasLegs();
        fish.hasLegs();

        Runnable r2 = () -> System.out.println("Hello, Java 8!");
    }
}
