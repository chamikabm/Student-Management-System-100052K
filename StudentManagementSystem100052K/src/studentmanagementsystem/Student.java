/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

// this is the class used to create student records
public class Student {

    private String firstName;
    private String lastName;
    private long regNumber;
    private String address;

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }
}
