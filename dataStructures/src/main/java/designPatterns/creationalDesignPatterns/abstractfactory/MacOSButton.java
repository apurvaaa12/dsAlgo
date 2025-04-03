package designPatterns.creationalDesignPatterns.abstractfactory;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Implementing a MAC OS Button");
    }
}
