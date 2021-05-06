package at.htl.boundary;

import at.htl.control.UnitRepository;
import at.htl.entity.Schoolclass;
import at.htl.entity.Unit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/unit")
@Produces(MediaType.APPLICATION_JSON)
public class UnitResource {

    @Inject
    UnitRepository ur;

    @GET
    @Path("/class/{clazz}")
    public List<Unit> unitByClass(@PathParam("clazz") String clazz) {
        return ur.find("schoolclass_id", clazz).list();
    }
}
