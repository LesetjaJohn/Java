/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import static cms.Student.StudentsRoll;
import java.util.ArrayList;

/**
 *
 * @author Dell-User
 */
public class RegularCourse extends Course{

    String instructor, stuName;
    final String TYPE = "Regular";
    String[] stuDetails;
    
    public RegularCourse(String courseCode, String courseName) {
        super(courseCode, courseName);
        
        //For Student roll
        stuDetails = new String[]{this.stuName, super.courseCode, super.courseName, this.TYPE, this.instructor,""};
    }
    
    public RegularCourse(String courseCode, String courseName, String instructor, String stuName){
        this(courseCode,courseName);
        
        this.instructor = instructor;
        this.stuName = stuName;
        //For Student roll
        stuDetails = new String[]{this.stuName, super.courseCode, super.courseName, this.TYPE, this.instructor,""};
    }
    
    @Override
    void displayInfo() {
        System.out.println("Student Name: "+this.stuName+" | Course Type:"+TYPE+" | Course Code: " + super.courseCode + " | Course Name: " + super.courseName + " | Instructor: " + this.instructor);
    }
    
    @Override
    public void enrollStudent(){
        StudentsRoll.add(new Student(stuDetails));
    }
    
}
