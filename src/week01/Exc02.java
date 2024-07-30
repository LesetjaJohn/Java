/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week01;

import java.util.Scanner;

/**
 *
 * @author Dell-User
 */
public class Exc02 {
    public static Scanner input = new Scanner(System.in);
    
    public static void WeekDay()
    {
        System.out.println("Enter Any number from 1 to 7:");
        Integer num = input.nextInt();
         switch(num)
        {
            case 1:
              System.out.println("Day: "+ num +" is Monday"); 
                break;
            case 2:
              System.out.println("Day: "+ num +" is Tuesday"); 
                break;
            case 3:
              System.out.println("Day: "+ num +" is Wednesday"); 
                break;
            case 4:
              System.out.println("Day: "+ num +" is Thursday"); 
                break;
            case 5:
              System.out.println("Day: "+ num +" is Friday"); 
                break;
            case 6:
              System.out.println("Day: "+ num +" is Saturday"); 
                break;     
            case 7:
              System.out.println("Day: "+ num +" is Sunday"); 
                break; 
            default:
              System.err.println("Error! Number must be between 1 and 7!"); 
                break;     
        }
    }
    
    public static void CheckVC()
    {
        System.out.println("Enter any Character:");
        Character entChar = input.nextLine().charAt(0);
        
        switch(Character.toLowerCase(entChar)){
            case 'a':case 'e':case 'i':case 'o':case 'u':
              System.out.println("Character: "+entChar+" is a Vowel!");
                break;
            default:
               System.out.println("Character: "+entChar+", I guess it is a Consonant!"); 
        }
    }
}
