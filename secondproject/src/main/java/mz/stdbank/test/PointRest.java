package mz.stdbank.test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Mário Júnior
 */
@Path("/point")
//@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PointRest {

    @Inject
    private PointRepository pointRepository;

    @Inject
    private EntityManager entityManager;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public long add(Point point){

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        pointRepository.save(point);
        transaction.commit();
        return point.getId();

    }

    @GET
    public List<Point> list(){

        return this.pointRepository.findAll();

    }


}
