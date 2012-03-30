package org.cse.springtute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms;

     ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("contxt.xml");
        
       StudentRepository repo = new SimpleStudentRepository();
       
         sms = new StudentManagementSystem(repo);
        
        sms.listAllStudents();
        repo.saveStudent((Student)cpxac.getBean("stu1"));
        repo.saveStudent((Student)cpxac.getBean("stu2"));
        repo.saveStudent((Student)cpxac.getBean("stu3"));
        repo.saveStudent((Student)cpxac.getBean("stu4"));
        repo.saveStudent((Student)cpxac.getBean("stu5"));
        repo.saveStudent((Student)cpxac.getBean("stu6"));
        sms.listAllStudents();


    }
}
