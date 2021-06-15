package senounta.nikos.rest_client.service;

import senounta.nikos.models.Order;

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
import java.util.List;

@Path("/orders")
public class PizzaService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getOrderByID(){
        Order order = new Order();
        order.getUser().setId(1);
        order.getUser().setName("John");
        order.getUser().setSurname("Doe");
        order.getUser().setAddress("TO THE MOON");
        order.getUser().setPhoneNum(6986971160L);
        System.out.println("before response");
            return Response
                    .ok(MediaType.APPLICATION_JSON)
                    .entity(order)
                    .build();
        }

}
