package at.htl.control;

import at.htl.entity.Teacher;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@Transactional
class TeacherRepositoryTest {

    @Inject
    TeacherRepository tr;

    @Test
    void t_001() {
        tr.persist(new Teacher("Test", "Test", "E06"));
    }
}
