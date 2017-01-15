package com.efrei.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Directors
 */
@XmlRootElement
public class Director {
    private String name;
    private String surname;
    private String birthdate;
    private int id;

    public Director(int id, String name, String surname, String birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Director() {
        this.id = -1;
        this.name = "";
        this.surname = "";
        this.birthdate = "2017";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
