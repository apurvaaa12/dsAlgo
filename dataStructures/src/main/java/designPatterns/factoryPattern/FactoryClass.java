package designPatterns.factoryPattern;

public class FactoryClass {

    public static Shape getShape(String shape){
        if(shape.equalsIgnoreCase("Circle")) return new Circle();
        if(shape.equalsIgnoreCase("Square")) return new Square();
        return null;
    }
}
