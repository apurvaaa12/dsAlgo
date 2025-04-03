package designPatterns.creationalDesignPatterns;

import designPatterns.creationalDesignPatterns.abstractfactory.*;
import designPatterns.creationalDesignPatterns.builder.User;
import designPatterns.creationalDesignPatterns.factory.Logistics;
import designPatterns.creationalDesignPatterns.factory.Ship;
import designPatterns.creationalDesignPatterns.factory.Truck;
import designPatterns.creationalDesignPatterns.singleton.Singleton;
import designPatterns.creationalDesignPatterns.singleton.SingletonThreadsafe;

public class Main {

    public static void main(String[] args){
        //Singleton
        Singleton singleton = new Singleton();
        Singleton secondSingleton = new Singleton();

        //Singleton Threadsafe
        SingletonThreadsafe singletonThreadsafe = new SingletonThreadsafe();
        SingletonThreadsafe secondSingletonThreadsafe = new SingletonThreadsafe();

        //Factory
        Logistics logistics = new Ship();
        Logistics logisticsTruck = new Truck();
        logistics.planDelivery("ship");
        logistics.planDelivery("bus");
        logisticsTruck.planDelivery("truck");
        logisticsTruck.planDelivery("car");

        //Abstract Factory
        AbstractFactorty factory;

        // Detect OS type dynamically
        String os = System.getProperty("os.name").toLowerCase();

        // Select factory based on OS
        if (os.contains("win")) {
            factory = new WindowsConcreteFactory();
        } else {
            factory = new MacConcreteFactory();
        }

        // Create application with the selected factory
        Application app = new Application(factory);
        app.renderUI();


        //Builder Pattern
        User user = new User.UserBuilder()
                .setName("Apurva")
                .setAge(25)
                .build();

        user.display();
    }
}
