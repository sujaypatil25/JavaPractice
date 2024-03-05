package org.example;

public class Student {
    private Integer sId;
    private String sName;
    private String sAddress;

    /* Replaced void -> Student so that object is returned and can be used for method chaining */
    public Student setsId(Integer sId) {
        this.sId = sId;
        return this;
    }

    public Student setsName(String sName) {
        this.sName = sName;
        return this;
    }

    public Student setsAddress(String sAddress) {
        this.sAddress = sAddress;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}
