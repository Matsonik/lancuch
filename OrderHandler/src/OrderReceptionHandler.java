public class OrderReceptionHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        System.out.println("Kelner przyjął zamówienie na: " + order.getDishName());
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}
