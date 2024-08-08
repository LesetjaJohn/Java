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
public abstract class Course implements Enrollable
{
    String courseCode, courseName;
    
    public Course(String courseCode, String courseName)
    {
        this.courseCode = courseCode; this.courseName = courseName;
    }
 
    abstract void displayInfo();
    
    @Override
    public void enrollStudent(){ }
    
    @Override
    public void unEnrollStudent(){ }
}
