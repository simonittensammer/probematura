package at.htl.control;

import at.htl.entity.Unit;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UnitRepository implements PanacheRepository<Unit> {
}
