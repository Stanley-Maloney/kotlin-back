package ro.gov.pmpvh

@Path("/cmia")
@Produces(MediaType.JSON)
@Consumes(MediaType.JSON)
public class Cmia  {
    @Path("/hello")
    fun hello(): String {
        return "Hello from RESTEasy Reactive"
    }
}