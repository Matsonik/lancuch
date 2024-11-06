public class DeliveryHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        if (order.isPrepared()) {
            System.out.println("Kelner dostarcza potrawę: " + order.getDishName());
            order.setDelivered(true);
        } else {
            System.out.println("Potrawa nie jest jeszcze gotowa, nie można dostarczyć.");
        }
    }
}
