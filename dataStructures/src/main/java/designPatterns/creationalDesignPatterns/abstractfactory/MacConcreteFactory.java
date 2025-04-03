package designPatterns.creationalDesignPatterns.abstractfactory;

public class MacConcreteFactory implements AbstractFactorty{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
