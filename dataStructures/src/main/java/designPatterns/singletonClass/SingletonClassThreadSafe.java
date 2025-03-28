package designPatterns.singletonClass;

public class SingletonClassThreadSafe {
    private static volatile SingletonClassThreadSafe singletonClassThreadSafe;

    private SingletonClassThreadSafe(){
        System.out.println("This is a thread safe class");
    }

    public static SingletonClassThreadSafe getInstance(){
        if(singletonClassThreadSafe == null){
            synchronized (SingletonClassThreadSafe.class){
                if(singletonClassThreadSafe == null){
                    singletonClassThreadSafe = new SingletonClassThreadSafe();
                }
            }
        }
        return singletonClassThreadSafe;
    }
}
