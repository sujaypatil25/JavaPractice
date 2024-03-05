package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <Employee> employees=new ArrayList<>(Arrays.asList(
                new Employee(23,"Sujay","Pune"),
                new Employee(53,"Rohit","USA"),
                new Employee(42,"Kamesh","Jalgaon"),
                new Employee(55,"Nikhil","Surat")));

        System.out.println(employees);
        employees.sort(new EmployeeComparator());
        System.out.println(employees);
    }


}