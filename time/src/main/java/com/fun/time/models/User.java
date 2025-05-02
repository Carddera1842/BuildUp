package com.fun.time.models;
import jakarta.persistence.*;

@Entity
public class User {

    private long userId;
    private String userName;
    private String userEmail;
    private String password;

}
