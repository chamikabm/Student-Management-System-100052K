package org.cse.springtute;

public class Student {

    private String firstName;
    private String lastName;
    private long regNumber;
    private String address;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public Student(String firstName, String lastName, long regNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
        this.address = address;
    }

    public Student() {
    }
}
