package designPatterns.creationalDesignPatterns.factory;

public class Truck implements Logistics{

    @Override
    public void planDelivery(String deliveryMode) {
        if(deliveryMode.equalsIgnoreCase("Truck")){
            createTransport();
        }else{
            System.out.println("Unknown delivery type");
        }
    }

    @Override
    public void createTransport() {
        System.out.println("Delivering via truck");
    }
}
