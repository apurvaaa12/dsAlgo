package designPatterns.creationalDesignPatterns.factory;

public interface Logistics {
    void planDelivery(String deliveryMode);
    void createTransport();
}
