/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import org.junit.*;
import static org.junit.Assert.*;


public class StudentManagementSystemTest {
    private static StudentRepository sR;
    private static Student s1;
    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        sR = new SimpleStudentRepository();
        s1= new Student();
        s1.setRegNumber(10000);
        s1.setFirstName("Vidudaya");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        sR = null;
        s1= null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
       StudentManagementSystem instance = new StudentManagementSystem(sR);
      instance.listAllStudents();
       
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu = s1;
       StudentManagementSystem instance = new StudentManagementSystem(sR);
      instance.registerStudent(stu);
        
    }
}
