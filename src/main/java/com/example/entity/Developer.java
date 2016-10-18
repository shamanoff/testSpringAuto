package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@Setter
//@AllArgsConstructor
public class Developer extends Human {

    public int id;
    public String position;
    public String manager;

    public Developer(String name, String sex, int age, int id, String position, String manager) {
        super(name, sex, age);
        this.id = id;
        this.position = position;
        this.manager = manager;
    }



    @Override
    public void displayInfo() {
        System.out.println("Name " + name + " Position " + position);
    }
}
