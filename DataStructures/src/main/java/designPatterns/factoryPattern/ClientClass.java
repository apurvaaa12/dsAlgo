package designPatterns.factoryPattern;

public class ClientClass {
    public static void main(String[] args){
        Shape shape = FactoryClass.getShape("circle");
        shape.draw();
    }
}
