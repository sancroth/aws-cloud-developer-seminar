package senounta.nikos.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

@JsonPropertyOrder({ "id", "user","pizzaOrder" })
public class Order {

    @Positive
    private Integer id = null;
    @NotNull
    private User user = null;
    @NotNull
    private List<PizzaOrder> pizzaOrder = null;

    public Order() {

    }

    public Order(Integer id, User user, List<PizzaOrder> pizzaOrder) {
        this.id = id;
        this.user = user;
        this.pizzaOrder = pizzaOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PizzaOrder> getPizzaOrder() {
        return pizzaOrder;
    }

    public void setPizzaOrder(List<PizzaOrder> pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
}
