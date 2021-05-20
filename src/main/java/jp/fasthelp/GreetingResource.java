package jp.fasthelp;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        foo();
        return "Hello RESTEasy";
    }

    private void foo() {

        Person person = new Person();
        person.setName("XXX");
        String name = person.getName();
        System.out.println(name);
    }
}