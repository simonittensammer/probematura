package at.htl.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "teacherSeq", sequenceName = "TEACHER_SEQ", initialValue = 1000)
public class Teacher extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "teacherSeq")
    public Long id;

    public String firstName;
    public String lastName;
    public String room;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String room) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.room = room;
    }
}
