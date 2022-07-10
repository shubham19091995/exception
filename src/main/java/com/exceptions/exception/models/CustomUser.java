package com.exceptions.exception.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public
class CustomUser{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String rolename;
    private String EMAIL;
    private String PHONE_NUMBER;
    private String HIRE_DATE;
    private int SALARY;
    private int MANAGER_ID;
    private int DEPARTMENT_ID;
}