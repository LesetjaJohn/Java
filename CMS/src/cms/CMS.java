/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import static cms.Student.StudentsRoll;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dell-User
 */
public class CMS {
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //1st Constructor
        RegularCourse rc = new RegularCourse("C#100", "Introduction To C#");
        Workshop ws = new Workshop("JV100", "Introduction to Java");
        rc.displayInfo();
        ws.displayInfo();
        
        //2nd Constructor
        System.out.println("2nd Constructor");
        RegularCourse rc2 = new RegularCourse("JV200", "Java 2nd week", "MR Softplugz", "John Mogashoa");
        Workshop ws2 = new Workshop("AB100", "AB Initio", "Business Intelligence", "Lesetja Mogashoa");
        rc2.displayInfo();
        ws2.displayInfo();
        //Enroll Student Test
        rc2.enrollStudent();
        ws2.enrollStudent();
        Student.displayStudentInfo();
        //displayStudentRoll();
        
    }
    
    public static void displayStudentRoll()
    {
        System.out.println("Student Roll");
        int i = 1;
        for(Student student : StudentsRoll)
        {
            System.out.println("Student "+i);
            System.out.println("Student Name: "+student.name+" | Course Type:"+student.type+" | Course Code: " + student.courseCode + " | Course Name: " + student.courseName + " | Instructor: " + student.instructor);
            i++;
        }
    }
}
