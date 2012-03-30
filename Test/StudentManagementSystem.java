package org.cse.springtute;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagementSystem {

    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }
    private StudentRepository repo;

    public void listAllStudents() {

        ArrayList<Student> list = (ArrayList<Student>) repo.findAllStudents();
        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next.getRegNumber() + " - " + next.getFirstName() + " " + next.getLastName());
        }

    }

    public void registerStudent(Student stu) {
        if (repo.findStudent(stu.getRegNumber()) != null) {
            repo.saveStudent(stu);
        } else {
            System.out.println("Student Already Registered, Update the profile?");
            if (true) {
                repo.updateStudent(stu);
            } else {
                System.out.println("Student " + stu.getFirstName() + " " + stu.getLastName() + " not saved.!");
            }
        }
    }
}
