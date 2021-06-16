package senounta.nikos.rest_client.service;

import senounta.nikos.models.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/orders/mock")
public class PizzaService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getOrderByID(){
        PizzaOrder order1 = new PizzaOrder(new Pizza(1,"Margarita",new DoughType(1,"slim")),1);
        PizzaOrder order2 = new PizzaOrder(new Pizza(2,"Patata Bacon",new DoughType(1,"filadelfia")),3);
    User user = new User(1,"ifigeneia","Gouli","TO THE MOON",6986971160L);
    List<PizzaOrder> pizzas = new ArrayList<PizzaOrder>(){{
        add(order1);
        add(order2);
    }};
        Order order = new Order(1,user,pizzas);
            return Response
                    .ok(MediaType.APPLICATION_JSON)
                    .entity(order)
                    .build();
        }

}
