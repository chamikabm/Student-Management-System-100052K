/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import java.util.List;
// this is the interface for build the functionality
public interface StudentRepository {

    void saveStudent(Student stu);

    void deleteStudent(Student stu);

    Student findStudent(long regNumber);

    void updateStudent(Student stu);

    List<Student> findAllStudents();
}
