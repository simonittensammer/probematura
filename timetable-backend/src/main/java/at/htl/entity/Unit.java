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

    public Unit() {
    }

    public Unit(Long day, Long unit, String subject, Teacher teacher, Schoolclass schoolClass) {
        this.day = day;
        this.unit = unit;
        this.subject = subject;
        this.teacher = teacher;
        this.schoolClass = schoolClass;
    }
}
