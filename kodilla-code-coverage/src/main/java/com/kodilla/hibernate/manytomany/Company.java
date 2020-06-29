package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COMPANIES")
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(name = "COMPANY_NAME", nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    private Set<Employee> employees = new HashSet<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
