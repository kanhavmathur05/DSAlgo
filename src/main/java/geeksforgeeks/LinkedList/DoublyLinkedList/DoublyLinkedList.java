package geeksforgeeks.LinkedList;

import java.util.LinkedList;

public class DoublyLinkedList {
    static class Student
    {
        String studentId;
        String name;

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String args[])
    {
        LinkedList<Student> list=new LinkedList<Student>();
        Student s1=new Student();
        s1.setName("fadsf");
        s1.setStudentId("adfadsf");

        Student s2=new Student();
        s2.setName("fadsf");
        s2.setStudentId("adfadsf");
        list.add(s1);
        list.add(s2);

        for (Student s:list)
        {
            System.out.println("Name:-"+s.getName());
            System.out.println("Student Id:-"+s.getStudentId());
        }
    }
}
