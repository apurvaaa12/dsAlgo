package designPatterns;

import java.util.function.Function;

public class Main implements InterfaceOne,InterfaceTwo{

   public static void main(String[] args){
       int age = InterfaceTwo.futureAge();
       System.out.println(age);

       Main main = new Main();
       main.name();
       main.age();
   }
}
