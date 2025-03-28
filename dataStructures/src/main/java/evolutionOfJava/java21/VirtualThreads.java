package evolutionOfJava.java21;

import java.util.concurrent.Executors;

public class VirtualThreads {
    public static void main(String[] args){
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                // Task code here
                System.out.println("inside thread executor");
            });
        }


    }
}
