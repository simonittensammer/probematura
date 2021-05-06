package at.htl.boundary;

import at.htl.control.SchoolclassRepository;
import at.htl.control.TeacherRepository;
import at.htl.entity.Schoolclass;
import at.htl.entity.Teacher;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/class")
@Produces(MediaType.APPLICATION_JSON)
public class SchoolclassResource {

    @Inject
    SchoolclassRepository sr;

    @Inject
    Logger log;

    @GET
    public List<Schoolclass> findAll() {
        return sr.listAll();
    }
}
