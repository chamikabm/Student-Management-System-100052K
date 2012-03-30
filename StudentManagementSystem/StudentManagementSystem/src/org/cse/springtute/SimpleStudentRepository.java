package org.cse.springtute;

import java.util.*;

public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    @Override
    public void saveStudent(Student stu) {

        studentsDb.put(stu.getRegNumber(), stu);
        System.out.println("student " + stu.getFirstName() + " saved..!");

    }

    @Override
    public void deleteStudent(Student stu) {
        studentsDb.remove(stu.getRegNumber());
        System.out.println("student " + stu.getFirstName() + " deleted..!");

    }

    @Override
    public Student findStudent(long regNumber) {
        return studentsDb.get(regNumber);

    }

    @Override
    public void updateStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);
        System.out.println("student " + stu.getFirstName() + " updated..!");
    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> list = new ArrayList<Student>();
        
        Collection<Student> values = studentsDb.values();
        Iterator<Student> iterator = values.iterator();
        
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        
        return list;
    }
}
