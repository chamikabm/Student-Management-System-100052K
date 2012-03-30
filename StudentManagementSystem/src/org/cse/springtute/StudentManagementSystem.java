package org.cse.springtute;

import java.util.List;
import java.util.ListIterator;

public class StudentManagementSystem {

    private StudentRepository repo;

    public void listAllStudents() {
      
        List<Student> list = repo.findAllStudents();
        ListIterator<Student> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().getRegNumber()+" - "+listIterator.next().getFirstName()+" "+listIterator.next().getLastName());
        }
        
    }

    public void registerStudent(Student stu) {
        if(repo.findStudent(stu.getRegNumber())!=null){
        repo.saveStudent(stu);
        }else{
            System.out.println("Student Already Registered, Update the profile?");
            if(true){
                repo.updateStudent(stu);
            }else{
                System.out.println("Student "+stu.getFirstName()+" "+stu.getLastName()+" not saved.!");
            }
        }
    }
}
