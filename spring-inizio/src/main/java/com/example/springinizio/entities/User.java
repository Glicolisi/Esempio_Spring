package com.example.springinizio.entities;

import jakarta.persistence.*;

@Entity//Prime cose da fare
@Table(name = "user")
public class User {
    @Id //primary key
    @Column(name = "id")//Assegna alla colonna il nome id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Autoincrementa id(gestito dal database) altrimenti @Sequency
    private Integer id;
    private String password;
    private String username;

    //METTERE SEMPRE COSTRUTTORE VUOTO

    public User(Integer id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }
    public User() {
    }

    public User(String username, String password) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
