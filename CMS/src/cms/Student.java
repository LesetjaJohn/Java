/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import java.util.ArrayList;

/**
 *
 * @author Dell-User
 */
public class Student implements Enrollable{
    String name, courseCode, courseName, type, instructor, method;
    String[] stuDetails;
    
    static ArrayList<Student> StudentsRoll = new ArrayList<>();
    
    public Student(String... stuDetails)
    {
        this.name = stuDetails[0];
        this.courseCode = stuDetails[1];
        this.courseName = stuDetails[2];
        this.type = stuDetails[3];
        this.instructor = stuDetails[4];
        this.method = stuDetails[5];
        this.stuDetails = stuDetails;
    }
    
    @Override
    public void enrollStudent() {
        StudentsRoll.add(new Student(stuDetails));
    }

    @Override
    public void unEnrollStudent() {
        StudentsRoll.remove(new Student(stuDetails));
    }
    
    public static void displayStudentInfo() 
    {
        System.out.println("Student Roll");
        int i = 1;
        for(Student student : StudentsRoll)
        {
            System.out.println("Student "+i);
            System.out.println("Student Name: "+student.name+" | Course Type:"+student.type+" | Course Code: " +
            student.courseCode + " | Course Name: " + student.courseName + " | Instructor: " + student.instructor + " | Topic: " + student.method);
            i++;
        }
    }
}
