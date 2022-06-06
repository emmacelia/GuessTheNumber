/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sample;
import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Emma Celia
 */
public class Sample {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Generate();
    }
    
    static void Generate(){
        
        //Variables for the generation
        int minNum = 1;
        int MaxNum = 100;
        int Guesses = 3;
        int UserInput;
        //Generating
        double RandomNum = Math.round(Math.random()*(MaxNum - minNum +1)+ minNum);
        
        System.out.println("The random number is: "+RandomNum);
        
        System.out.println("You have 3 Guesses to Win");
        Scanner UserIn = new Scanner(System.in);
        
        for (int i = 0; i < Guesses; i++) {
       
            System.out.println("Please enter a number between 1 and 100");
            UserInput = UserIn.nextInt();
            
            if(UserInput == RandomNum){
                
                System.out.println("You have won!");
                break;
            }  
             if(UserInput != RandomNum){
                
                System.out.println("You have not guess correctly!");
            }  
        }
       //Prints out the random numbers to make sure theyre printed right 
        System.out.println("The random number is: "+RandomNum);
         
         
    }  
    
}
