package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1=new Student(25,"Sujay","Pune");
        Student s2=new Student(23,"Rohit","USA");
        Student s3=new Student(26,"Kamesh","Jalgaon");
        Student s4=new Student(22,"Nikhil","Surat");

        List<Student> sList=new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);

        System.out.println(sList);
        Collections.sort(sList);
        System.out.println(sList);
    }
}