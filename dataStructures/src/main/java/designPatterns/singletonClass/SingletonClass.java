package designPatterns.singletonClass;

public class SingletonClass {
   private static SingletonClass singletonClass =null;

   private SingletonClass(){
       System.out.println("This is a singleton CLass");
   }

   public static SingletonClass getInstance(){
       if(singletonClass ==null){
           new SingletonClass();
       }

       return singletonClass;
   }

}
