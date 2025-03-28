package evolutionOfJava.java8.defaultmethods;

public class Fish implements Animal{
    @Override
    public void name() {
        System.out.println("My name is a fish");
    }

    public void hasLegs() {
        System.out.println("It doesn't have legs");
    }
}
