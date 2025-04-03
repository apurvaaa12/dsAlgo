package designPatterns.creationalDesignPatterns.factory;

public class Ship implements Logistics{
    @Override
    public void planDelivery(String deliveryMode) {
        if(deliveryMode.equalsIgnoreCase("ship")){
            createTransport();
        }else{
            System.out.println("Unknown delivery type");
        }
    }

    @Override
    public void createTransport() {
        System.out.println("Shipping via ship");
    }
}
