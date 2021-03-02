package org.example.SpringRestProject.forModel;

import javax.persistence.*;


@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", columnDefinition = "int auto_increment")
    private long id;

    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(){

    }


    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

