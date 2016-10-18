package com.example.entity;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public abstract class Human {
    public String name;
    public String sex;
    public int age;

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public abstract void displayInfo();



}
