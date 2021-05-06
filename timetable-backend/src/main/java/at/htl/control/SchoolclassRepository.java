package at.htl.control;

import at.htl.entity.Schoolclass;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SchoolclassRepository implements PanacheRepository<Schoolclass> {
}
