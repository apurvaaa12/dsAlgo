package designPatterns.singletonClass;

public class MainMethod {

    public static void main(String[] args){
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);

        SingletonClassThreadSafe singletonClassThreadSafe = SingletonClassThreadSafe.getInstance();
    }

}
