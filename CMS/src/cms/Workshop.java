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
public class Workshop extends Course{

    String topic, stuName;
    String[] stuDetails;
    final String TYPE = "Workshop";
    
    public Workshop(String CourseCode, String courseName) {
        super(CourseCode, courseName);
        
        //For Student roll
        stuDetails = new String[]{this.stuName, super.courseCode, super.courseName, this.TYPE,"", this.topic};
    }
    
    public Workshop(String code, String name, String topic, String stuName){
        this(code,name);
        
        this.topic = topic;
        this.stuName = stuName;
        
        //For Student roll
        stuDetails = new String[]{this.stuName, super.courseCode, super.courseName, this.TYPE,"", this.topic};
    }
    
    @Override
    void displayInfo() {
        System.out.println("Student Name: "+this.stuName+" | Course Type:"+TYPE+" | Course Code: " + super.courseCode + " | Course Name: " + super.courseName+ " | Current Topic: " + this.topic);
    }
    
    @Override
    public void enrollStudent(){
        StudentsRoll.add(new Student(stuDetails));
    }
}
