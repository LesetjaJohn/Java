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
    
    public static void StringsExc()
    {
        System.out.println("Enter any Fullname:");
        String fullName = input.nextLine().toLowerCase();
        //Index of Separator
        Integer idx = fullName.indexOf(" ");
        char firstChar;
        //Name
        String name = fullName.substring(0, idx);
        firstChar = name.charAt(0);
        name = Character.toUpperCase(firstChar)+ name.substring(1);
        //Surname
        String surname = fullName.substring(idx +1);
        firstChar = surname.charAt(0);
        surname = Character.toUpperCase(firstChar)+ surname.substring(1);
        
        System.out.println("Your Name: " + name);
        System.out.println("Your Surname: " + surname);        
    }
    
    public static void ArraysExc()
    {
        System.out.println("Enter any Number:");
        int num = input.nextInt();
        
        int[] numArr = new int[num + 1];
        for (int i = 0; i <= num; i++) 
        {
            numArr[i] = i;
            System.out.println("Array Index = ["+i+"] holds value " + numArr[i]); 
        }
    }
    //Anonymous Arrays
    public static String[] SetStrings()
    {
        return new String[]{"Johnzana", "Polokwane", "Limpopo", "Monzana","Danko"};
    }
    public static Double[] SetDoubles()
    {
        return new Double[]{10.1, 11.2, 12.3, 13.4,14.5};
    }
    //Method Overloading
    public static int getHighestNum(int... nums)
    {
        int highest = 0;
        for(int num:nums)
        {
            if(num >= highest)
            {
                highest = num;
            }
        }
       return highest;
    }
    public static double getHighestNum(double num01,int num02)
    {
        return Math.max(num01, num02);
    }

}
