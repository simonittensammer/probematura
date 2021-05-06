package at.htl.entity;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@Transactional
class TeacherTest {

    @Inject
    EntityManager em;

    @Test
    void t_001() {
        em.persist(new Teacher("Test", "One", "E06"));
    }
}
