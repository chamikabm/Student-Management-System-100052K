/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author SUDHEERA
 */
public class StudentManagementSystemTest {
    
    SimpleStudentRepository repo;
    
    public StudentManagementSystemTest() {
        repo= new SimpleStudentRepository();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
        StudentManagementSystem instance = new StudentManagementSystem(repo);
        instance.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu = null;
        StudentManagementSystem instance = new StudentManagementSystem(repo);
        instance.registerStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
