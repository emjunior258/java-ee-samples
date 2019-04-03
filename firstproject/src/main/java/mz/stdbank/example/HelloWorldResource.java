package mz.stdbank.example;

/**
 * @author Mário Júnior
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.MathContext;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {

    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/member")
    public Member getMember(){
        Member member = new Member();
        member.setName("Jose");
        member.setAge(34);
        return member;
    }

    @POST
    @Path("/member")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String createMember(Member member){

        return member.getName();

    }

}