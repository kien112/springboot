package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Cars")
public class Car {

    @Id
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id", foreignKey =@ForeignKey(name = "fk_Car_Category"))
    private Category category;
    public Car() {
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

    public Long getId() {
        return id;
    }
}
