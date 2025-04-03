package designPatterns.creationalDesignPatterns.singleton;

public class SingletonThreadsafe {
    public static volatile SingletonThreadsafe instance;

    public SingletonThreadsafe(){
        System.out.println("Thread Safe singleton");
    }

    public static SingletonThreadsafe getInstance() {
        if(instance ==null){
            synchronized (SingletonThreadsafe.class){
                if(instance==null){
                    instance = new SingletonThreadsafe();
                }
            }
        }
        return instance;
    }
}
