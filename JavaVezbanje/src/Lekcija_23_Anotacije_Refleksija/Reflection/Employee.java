package Lekcija_23_Anotacije_Refleksija.Reflection;

public class Employee extends Person {

    public String firstName, lastName, address;
    public int age;

    public Employee(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    @Override
    public void raiseSalary() {
        System.out.println("Raising salary for Employee...");
    }

    public void changeAddress(String newAddress) {
        System.out.println("The new address is " + newAddress);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}