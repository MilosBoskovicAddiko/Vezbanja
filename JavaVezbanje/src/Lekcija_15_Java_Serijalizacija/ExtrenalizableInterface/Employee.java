package Lekcija_15_Java_Serijalizacija.ExtrenalizableInterface;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class Employee implements Externalizable {

    String fName;
    String lName;
    String address;
    Date hireDate;
    int id;
    double salary;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //Serijalizovanje samo salary i id polja
        out.writeDouble(salary);
        out.writeInt(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        // Redosled citanja mora da bude isti kao i redosled upisivanja
        in.readDouble();
        in.readInt();
    }

    @Override
    public String toString() {
        return "Employee{ id=" + id +
                ", salary=" + salary +
                '}';
    }
}
