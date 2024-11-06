public class CookingHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        System.out.println("Kucharz przygotowuje potrawę: " + order.getDishName());
        order.setPrepared(true);
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}
