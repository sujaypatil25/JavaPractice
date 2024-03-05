package org.example;

import java.util.Comparator;

public class EmployeeAddressComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.geteAddress().compareTo(o2.geteAddress());
    }
}
