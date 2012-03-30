

package org.cse.springtutetest;

import org.cse.springtute.Student;
import org.cse.springtute.SimpleStudentRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class simplestudentRepositorytest {
    SimpleStudentRepository repo;
    Student stu[];

    public simplestudentRepositorytest() {
        repo=new SimpleStudentRepository();
        stu[0]= new Student("sudheera", "palihakkara", 100366, "Moratuwa Sri Lanka");
        stu[1]= new Student("chamika", "kasun", 100052, "Moratuwa Sri Lanka");
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        repo.saveStudent(stu[0]);
    }

    @AfterClass
    public  void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void saveStudent() {
     
     
     }

     @Test
     public void deleteStudent(){

     }

     @Test
     public void findStudent(){
         
     }
     
     @Test
     public void updateStudent(){
         
     }
     
     @Test
     public void findAllStudents(){
         
     }

}