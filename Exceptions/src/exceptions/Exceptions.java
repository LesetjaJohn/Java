/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author Dell-User
 */
public class Exceptions {

    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        Exceptions exc = new Exceptions();
        
        //exc.divideByZeroExc();
        //exc.checkOddExc();
        //exc.checkForVowels();
    }
    
    public void divideByZeroExc()
    {
        double val1, val2, ans;        
        try {
            System.out.println("Enter Divident value:");
            val1 = in.nextDouble();
            System.out.println("Enter Divisor value:");
            val2 = in.nextDouble();
            
            if(val2 == 0)
            {
                throw new ArithmeticException("Error! Divisor Cannot be zero(0)!");
            }
            else{
                ans = val1/val2;
                System.out.println("Your answer is: " + ans);
            }
        } 
        catch (ArithmeticException e) {
         System.err.println(e.getMessage());
        }
    }
    
    public void checkOddExc()
    {
        System.out.println("Enter an Even number:");
        int num = in.nextInt();
        try {
            if(num%2 != 0){
                throw new IllegalArgumentException("Error! Number entered is an Odd number!");
            }
            else{
                System.out.println("Thank you for your time.");
            }
        } 
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void checkForVowels(){
        System.out.println("Enter any Phrase containing vowels in it:");
        String st = in.nextLine().toLowerCase();
        try {
          if(st.contains("a") || st.contains("e") || st.contains("i") || st.contains("o") || st.contains("u") ){
              System.out.println("Thank you, Your Phrase contains vowels in it.");
          } 
          else{
              throw new Exception("Error! Your Phrase does not contain Vowels!");
          }
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void checkAge(){
        System.out.println("Enter your Age:");
        try {
            int age = in.nextInt();
        } 
        catch (Exception e) {
        }
        
        
    }
    
}   

