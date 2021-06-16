package senounta.nikos.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;

@JsonPropertyOrder({ "pizza", "quantity" })
public class PizzaOrder {

    @NotNull
    private Pizza pizza = null;
    @NotNull
    private Integer quantity = null;

    public PizzaOrder(Pizza pizza, Integer quantity) {
        this.pizza = pizza;
        this.quantity = quantity;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
