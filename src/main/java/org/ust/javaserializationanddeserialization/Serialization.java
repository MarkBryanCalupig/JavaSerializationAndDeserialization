package org.ust.javaserializationanddeserialization;

import org.ust.javaserializationanddeserialization.entity.Employee;
import org.ust.javaserializationanddeserialization.Deserialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Monica Mittal";
        employee.address = "Hyderabad";

            try {
                FileOutputStream fileOut = new FileOutputStream("Char.txt");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(employee);
                    out.close();
                fileOut.close();
                System.out.printf("Serializedd data is saved in char.txt file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
