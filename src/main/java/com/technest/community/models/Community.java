package com.technest.community.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "community")
public class Community {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Max(value = 400)
    private String cause;

    @CreationTimestamp
    private Date createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private Citizens citizens;

    public Community() {
    }

    public Community(Long id, String name, String cause) {
        this.id = id;
        this.name = name;
        this.cause = cause;
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

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Citizens getCitizens() {
        return citizens;
    }

    public void setCitizens(Citizens citizens) {
        this.citizens = citizens;
    }

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", createdAt=" + createdAt +
                ", citizens=" + citizens +
                '}';
    }
}
