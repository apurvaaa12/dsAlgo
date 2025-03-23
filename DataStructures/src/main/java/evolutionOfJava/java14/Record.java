package evolutionOfJava.java14;

public class Record {
    public static void main(String[] args){
        record Person(String name, int age, int number){ }

        Person person = new Person("Apurva",25,99);
        Person person2 = new Person("Monica",25,44);
        System.out.println(person2);
    }
}
