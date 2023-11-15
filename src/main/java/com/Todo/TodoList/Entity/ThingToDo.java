package com.Todo.TodoList.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity(name = "ThingToDo")
@Table(name = "thing_to_do")

public class ThingToDo {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long Id;
    private String name;
    private String detail;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ThingToDo() {
    }
}
