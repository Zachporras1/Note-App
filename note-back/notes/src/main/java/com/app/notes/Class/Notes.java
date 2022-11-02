package com.app.notes.Class;

import javax.persistence.*;

@Entity
@Table(name="notes")
public class Notes {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name = "name")
    private String name;
@Column(name="notes")
    private String notes;

    public Notes() {
    }

    public Notes(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
