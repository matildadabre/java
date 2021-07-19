package com.vectortest.Test.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="email")
    @NotBlank(message="Email is a required field")
    private String email;

    @Column(name="password")
    @NotBlank(message="Password is a required field")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) { this.firstname = firstname;	}

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {	this.lastname = lastname;	}

    public String getEmail() {	return email;	}

    public void setEmail(String email) {	this.email = email;	}

    public String getPassword() {	return password;	}

    public void setPassword(String password) {	this.password = password;	}
}

