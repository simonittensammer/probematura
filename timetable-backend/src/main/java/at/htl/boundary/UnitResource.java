package at.htl.boundary;

import at.htl.control.SchoolclassRepository;
import at.htl.control.TeacherRepository;
import at.htl.control.UnitRepository;
import at.htl.entity.Schoolclass;
import at.htl.entity.Teacher;
import at.htl.entity.Unit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

@Path("/unit")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class UnitResource {

    @Inject
    UnitRepository ur;

    @Inject
    TeacherRepository tr;

    @Inject
    SchoolclassRepository sr;

    @GET
    @Path("/class/{clazz}")
    public List<Unit> unitByClass(@PathParam("clazz") String clazz) {
        return ur.find("schoolclass_id", clazz).list();
    }

    @POST
    public Response create(JsonObject jsonObject) {
        Teacher teacher = tr.findById(
                jsonObject.getJsonNumber("teacherId").longValue()
        );

        Schoolclass schoolclass = sr.find("id", jsonObject.getString("schoolclassId")).firstResult();

        Unit unit = new Unit(
                jsonObject.getJsonNumber("day").longValue(),
                jsonObject.getJsonNumber("unit").longValue(),
                jsonObject.getJsonString("subject").getString(),
                teacher,
                schoolclass
        );

        ur.persist(unit);
        return Response.ok(unit).build();
    }
}
