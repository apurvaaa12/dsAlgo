package evolutionOfJava.java17;

public class VirtualThread {
    public static void main(String[] args){
        Thread.ofVirtual().start(()-> System.out.println("This is a Virtual Thread" ));

        Thread.ofPlatform().start(()-> System.out.println("This is platform thread" ));
    }
}
