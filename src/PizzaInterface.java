import java.util.List;

public interface PizzaInterface {
    public Pizza getPizzaBySize(String size);
    public Pizza getPizzaById(int id);
    public Pizza getPizzaByName(String name);
    public Pizza orderNewPizza(Pizza pizza, Customer customer);
    public List<Pizza> getAllPizza();
    public Pizza updatePrice(Pizza pizza, double newPrice);
    public void deletePizza(Pizza pizza);
    public Pizza addNewPizza(Pizza pizza);
}
