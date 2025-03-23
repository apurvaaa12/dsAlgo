package evolutionOfJava.java8.defaultmethods;

public interface Animal {

    public void name();

    public default void hasLegs() {
        System.out.println("It has legs");
    }
}
