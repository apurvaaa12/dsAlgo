package designPatterns.creationalDesignPatterns.abstractfactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(AbstractFactorty factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

}
