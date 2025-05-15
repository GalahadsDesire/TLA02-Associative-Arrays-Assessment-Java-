/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hash;

import java.util.HashMap;

import java.util.Scanner;

/**
 *
 * @author Students Account
 */
public class Hash {

    public static void main(String[] args) {
        
        HashMap<String,Integer> stud = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        String Student;
        int Score;
        stud.put("Mark",100);
        stud.put("Vladimir", 95);
        stud.put ("Ninmar", 94);
        stud.put ("Joshua", 74);
        stud.put("Ampi", 80);
            int choice;
   System.out.println("Welcome to Student Viewer/update");
        System.out.println("Enter 1: To Find a score of the student");
        System.out.println("Enter 2: To Update a students score");
           System.out.println("ENTER Choice");
           
           choice = scanner.nextInt();
           
          
           
           if(choice == 1){
               
               
               System.out.println("Enter Student name to check the score");
               
               Student = scanner.next();
               
               System.out.println(stud.get(Student)); 
               
               
           } else if (choice == 2){
               System.out.println("Enter a student name to change");
               
               Student = scanner.next();
              
               
               System.out.println("Enter Score");
               Score = scanner.nextInt();
               
               stud.put(Student,Score);
               
             for (Object objectName : stud.keySet()) {
   System.out.println(objectName);
   System.out.println(stud.get(objectName));
 }

               
           } else {
               
               System.out.println("ENTER A VALID NUMBER 1-2");
               
           }
    
           
           
           
           
    }
}
