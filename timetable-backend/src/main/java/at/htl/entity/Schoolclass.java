package at.htl.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schoolclass extends PanacheEntityBase {

    @Id
    public String id;

    public String room;

    public Schoolclass() {
    }

    public Schoolclass(String id, String room) {
        this.id = id;
        this.room = room;
    }
}
