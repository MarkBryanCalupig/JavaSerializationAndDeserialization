package org.ust.javaserializationanddeserialization.entity;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;

    public String role;
    public Employee (String name, String address, String role) {
        this.name = name;
        this.address = address;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
