package org.ust.javaserializationanddeserialization;

import org.ust.javaserializationanddeserialization.entity.Employee;
import org.ust.javaserializationanddeserialization.Serialization;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Employee employee = null;

        try {
            FileInputStream fileIn = new FileInputStream("Char.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn); employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
    } finally {
            System.out.println("Deserializing Employee...");
            System.out.println("First Name of Employee: " +employee.name);
            System.out.println("Last Name of Employee: " +employee.address);
        }
    }
}
