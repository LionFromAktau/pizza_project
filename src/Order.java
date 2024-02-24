import java.util.List;
public class Order {
    private List<Pizza> pizzas;
    private String orderDiscription;
    private double payableBillAmount;
    private String orderDate;
    private int orderId;

    public Order() {}

    public Order(String orderDiscription, double payableBillAmount, String orderDate, int orderId) {
        this.orderDiscription = orderDiscription;
        this.payableBillAmount = payableBillAmount;
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    public void addPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }

    @Override
    public String toString(){
        return
    }

}
