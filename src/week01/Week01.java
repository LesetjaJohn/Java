/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;
import jdk.nashorn.internal.codegen.types.Type;

/**
 *
 * @author Dell-User
 */
public class Week01 {

    /**
     * @param args the command line arguments
     */
    public static Exc02 exc = new Exc02();
    
    public static void main(String[] args) {
       //Excercise 01
        //WeekDay();
        //Excercise 02
        //Exc02 exc = new Exc02();
        //exc.WeekDay();
        //Excercise 03
        //exc.CheckVC();

        //TaxApp
        /*Week01 forTax = new Week01();
        forTax.ManageTax();*/
        
        //Day03
        //exc.StringsExc();
        //exc.ArraysExc();
        
        //AnonymousArrarys
        AnonymousArrs();
    }

    public static void WeekDay() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String name = input.nextLine();
        System.out.println("Enter your Surname:");
        String surname = input.nextLine();
        System.out.println("Enter your Age:");
        Integer age = input.nextInt();
        Integer exp = 16 - age;
        if (age < 16) {
            System.out.println("Sorry: " + name + " " + surname + ", You still have " + exp + " more years to go!");
        } else if (age >= 16 && age <= 18) {
            System.out.println("Congradulations, You are eligible to book!");
        } else if (age > 18) {
            System.out.println("Welcome to adulthood!");
        }
    }

    public void ManageTax() 
    {
        String monthlySalary = JOptionPane.showInputDialog(null, "Hello User, Please Enter Your Monthly Salary:", "Input", JOptionPane.QUESTION_MESSAGE);
        TaxApp app = new TaxApp();
        app.setAnnualSalary(Double.parseDouble(monthlySalary));
        app.DisplayTaxes();
    }
    public static void AnonymousArrs()
    {
        //Anonymous Arrays
        String[] stringsArr = new String[5];
        Double[] doubleArr = new Double[5];
        //Innitialisation
        stringsArr = exc.SetStrings();
        doubleArr = exc.SetDoubles();
        //Print
        System.out.println("Random Strings: "+ Arrays.toString(stringsArr));
        System.out.println("Random Doubles: " + Arrays.toString(doubleArr));
    }
}
