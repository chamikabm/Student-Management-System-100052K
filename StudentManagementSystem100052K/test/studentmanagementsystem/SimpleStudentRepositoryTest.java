/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;


public class SimpleStudentRepositoryTest {
    private static Student s1;
    private static Student s2;
    private static List<Student> list;
    private static StudentRepository instance;
    public SimpleStudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        instance = new SimpleStudentRepository();
        s1 = new Student();
        s1.setRegNumber(10000);
        s1.setFirstName("Vidudaya");
        s2 = new Student();
        s2.setRegNumber(10001);
        s2.setFirstName("Chamika");
        list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        list = null;
        s1=s2=null;
        instance = null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student stu = s1;        
        instance.saveStudent(stu);
        //this is only for check the findStudent method
        Student stu2 = s2;
        instance.saveStudent(stu2);
        
    }

    /**
     * Test of deleteStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student stu = s1;
        
        instance.deleteStudent(stu);
        
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = 10001;
        
        Student expResult =s2;
        Student result = instance.findStudent(regNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student stu = s1;
        
        instance.updateStudent(stu);
       
    }

    /**
     * Test of findAllStudents method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        
        List expResult = list;
        List result = instance.findAllStudents();
        assertEquals(expResult, result);
       // this will sometimes fail because the resulting list may not be in thecorrect order since here
        // we do not form the list in a sorted order
    }
}
