package org.example;

public class Employee {
    private Integer eId;
    private String eName;
    private String eAddress;

    public Employee(Integer eId, String eName, String eAddress) {
        this.eId = eId;
        this.eName = eName;
        this.eAddress = eAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eAddress='" + eAddress + '\'' +
                ", eName='" + eName + '\'' +
                '}';
    }

    public Integer geteId() {
        return eId;
    }

    public String geteAddress() {
        return eAddress;
    }

    public String geteName() {
        return eName;
    }
}
