package designPatterns.creationalDesignPatterns.singleton;

public class Singleton {
    public static Singleton instance ;

    public Singleton() {
        System.out.println("This is a singleton Clasee");
    }

    public static Singleton getInstance() {
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
