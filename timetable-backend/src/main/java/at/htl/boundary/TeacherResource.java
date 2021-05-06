package at.htl.boundary;

import at.htl.control.TeacherRepository;
import at.htl.entity.Teacher;
import io.quarkus.panache.common.Sort;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/teacher")
@Produces(MediaType.APPLICATION_JSON)
public class TeacherResource {

    @Inject
    TeacherRepository tr;

    @GET
    public List<Teacher> findAll() {
        return tr.list("order by lastName asc");
    }
}
