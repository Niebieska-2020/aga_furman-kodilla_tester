package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "TASKLISTS")
public class TaskList implements Serializable {

    private long id;
    private String listName;
    private String description;

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ID", unique = true)
    public long getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    @NotNull
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
