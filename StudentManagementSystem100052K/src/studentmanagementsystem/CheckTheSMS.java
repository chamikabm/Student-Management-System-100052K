/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import java.util.List;

public class CheckTheSMS {

    // this class is used to check the functionality
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setRegNumber(1000);
        s2.setRegNumber(1001);
        s3.setRegNumber(1002);

        s1.setFirstName("Vidudaya");
        s2.setFirstName("Sudeera");
        s3.setFirstName("Chamika");

        s1.setLastName("Bandara");
        s2.setLastName("Palihakkara");
        s3.setLastName("Bandara");

        SimpleStudentRepository studentDB = new SimpleStudentRepository();

        studentDB.saveStudent(s1);
        studentDB.saveStudent(s2);
        studentDB.saveStudent(s3);



        new StudentManagementSystem(studentDB).listAllStudents();
    }
}
