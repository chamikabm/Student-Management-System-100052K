/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("smsContext.xml");
        StudentRepository sR = new SimpleStudentRepository();
        StudentManagementSystem sms = new StudentManagementSystem(sR);

        sR.saveStudent((Student) c.getBean("s1"));
        sR.saveStudent((Student) c.getBean("s2"));
        sR.saveStudent((Student) c.getBean("s3"));
        sR.saveStudent((Student) c.getBean("s4"));
        sR.saveStudent((Student) c.getBean("s5"));
        sR.saveStudent((Student) c.getBean("s6"));
        sms.listAllStudents();
        //load the bean from spring
//		sms.listAllStudents();
//		sms.registerStudent(stu);
//		sms.listAllStudents();
    }
}
