package designPatterns.creationalDesignPatterns.abstractfactory;

public class MacOsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Macos checkbox");
    }
}
