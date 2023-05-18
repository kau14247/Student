/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this templat
import java.util.Scanner;
package student;

/**
 *
 * @author Ravee
 */
public class Student {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array of student objects declaration
        Student[] list = new Student[3];
        Scanner in = new Scanner(System.in);
        // store 3 student objects in array, also defines each student name , age
        for(int i=0; i<list.length; i++)
       {
           String n=in.next();
           int a = in.nextInt();
           // create a object
           Student s1 = new Student(n,a);//one object s1 details 
           list[i]=s1;
       }
        for (int i=0; i<list.length; i++)
        {
            System.out.println(list[i].getName()+""+list[i].getage());
            
        }
    }
    
}
