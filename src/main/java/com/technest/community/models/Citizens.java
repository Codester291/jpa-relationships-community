package com.technest.community.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "citizen")
public class Citizens {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    @CreationTimestamp
    private Date createdAt;


    @OneToMany(mappedBy = "citizens")
    private List<Community> community;


    public Citizens() {
    }

    public Citizens(Long id, String firstName, String lastName, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Community> getCommunity() {
        return community;
    }

    public void setCommunity(List<Community> community) {
        this.community = community;
    }


    @Override
    public String toString() {
        return "Citizens{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", community=" + community +
                '}';
    }
}
