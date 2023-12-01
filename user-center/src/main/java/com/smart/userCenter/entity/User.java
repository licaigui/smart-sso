package com.smart.userCenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", length = 100)
    private String name;

    @Column(name="email", length=100)
    private String email;

    @Column(name="password", length=100)
    private String password;

    @Column(name="status")
    private Integer status;
}
