public class Main {
    public static void main(String[] args) {
        Order order = new Order("Pizza Margherita");
        OrderHandler reception = new OrderReceptionHandler();
        OrderHandler cooking = new CookingHandler();
        OrderHandler delivery = new DeliveryHandler();
        reception.setNextHandler(cooking);
        cooking.setNextHandler(delivery);
        reception.handleOrder(order);
        System.out.println("Zamówienie przygotowane: " + order.isPrepared());
        System.out.println("Zamówienie dostarczone: " + order.isDelivered());
    }
}
