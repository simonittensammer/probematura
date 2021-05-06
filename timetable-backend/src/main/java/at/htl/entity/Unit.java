package at.htl.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Unit extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long day;
    public Long unit;
    public String subject;

    @ManyToOne
    public Teacher teacher;

    @ManyToOne
    public Schoolclass schoolClass;
}
