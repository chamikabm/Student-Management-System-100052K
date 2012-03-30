/**
 * Programming Challenge 1 - Final Project
 * @author Bandara B.M.C.K 100052K
 */
package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class StudentRepositoryTest {

    private static Student s1;
    private static List<Student> list;
    private static StudentRepository instance;

    public StudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        s1 = new Student();
        s1.setRegNumber(10000);
        s1.setFirstName("Vidudaya");
        list = new ArrayList<Student>();
        list.add(s1);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        s1 = null;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of saveStudent method, of class StudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student stu = s1;
        StudentRepository instance = new StudentRepositoryImpl();
        instance.saveStudent(stu);

    }

    /**
     * Test of deleteStudent method, of class StudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student stu = s1;
        StudentRepository instance = new StudentRepositoryImpl();
        instance.deleteStudent(stu);

    }

    /**
     * Test of findStudent method, of class StudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = 10000;
        StudentRepository instance = new StudentRepositoryImpl();
        Student expResult = s1;
        Student result = instance.findStudent(regNumber);
        assertEquals(expResult, result);
        // this will sometimes fail since the delete Student method will delete the record and there will be a null pointer
        // exception
    }

    /**
     * Test of updateStudent method, of class StudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student stu = s1;
        StudentRepository instance = new StudentRepositoryImpl();
        instance.updateStudent(stu);

    }

    /**
     * Test of findAllStudents method, of class StudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        StudentRepository instance = new StudentRepositoryImpl();
        List expResult = list;
        List result = instance.findAllStudents();
        assertEquals(expResult, result);
        // this will sometimes fail since the delete Student method will delete the record and there will be a null pointer
        // exception
    }

    public class StudentRepositoryImpl implements StudentRepository {

        public void saveStudent(Student stu) {
        }

        public void deleteStudent(Student stu) {
        }

        public Student findStudent(long regNumber) {
            return null;
        }

        public void updateStudent(Student stu) {
        }

        public List<Student> findAllStudents() {
            return null;
        }
    }
}
