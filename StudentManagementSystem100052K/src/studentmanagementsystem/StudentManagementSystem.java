/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import java.util.List;

public class StudentManagementSystem {

    private StudentRepository repo;
    
    // this constructor use to initialize the StudentRepository object repo
    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }

    public void listAllStudents() {
        //this will print all  the student list
        List<Student> list = (List<Student>) repo.findAllStudents();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ") " + list.get(i).getRegNumber()+" "+list.get(i).getFirstName()+" "+list.get(i).getLastName());
        }
    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
    }
}
