/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionstask;

import java.util.Scanner;

/**
 *
 * @author Dell-User
 */
public class CustomException{

    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws NegativeNumException 
    {
        System.out.println("Enter a Positive number:");
        try {
            int num =  in.nextInt();
            CustomException exc = new CustomException();
            exc.checkNegative(num) ;
        } 
        catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
        finally{
            System.out.println("Thank you for your time!");
        }
        
    }
    
    public void checkNegative(int num) throws NegativeNumException
    {
        if(num < 0){
            throw new NegativeNumException("Only Positive Numbers are Allowed!");
        }
        else{
            System.out.println("Input Valid. " + num);
        }
    }
}
