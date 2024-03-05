package org.example;

public class Student implements Comparable<Student>{

    private Integer sId;
    private String sName;
    private String sAddress;

    public Student(Integer sId, String sName, String sAddress) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;
    }

    public Integer getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getsAddress().compareTo(o.getsAddress());
    }
}
