package designPatterns.creationalDesignPatterns.abstractfactory;

public class WindowsConcreteFactory implements AbstractFactorty{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
