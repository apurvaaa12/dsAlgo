package designPatterns.creationalDesignPatterns.abstractfactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("windows checkbox");
    }
}
