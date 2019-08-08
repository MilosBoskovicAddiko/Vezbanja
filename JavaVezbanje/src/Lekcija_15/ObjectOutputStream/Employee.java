package Lekcija_15.ObjectOutputStream;

import java.io.Serializable;

public class Employee implements Serializable {

    public String fName;
    public String lName;
    public transient double salary; // transient key word (field won't be serialized)

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
