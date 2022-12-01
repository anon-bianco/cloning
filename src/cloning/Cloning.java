/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cloning;

/**
 *
 * @author hilbe
 */

public class Cloning {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        student1 obj1 = new student1(101,"Arun");
        student obj2=(student)obj1.clone();
        System.out.println("The roll no is" + obj1.rollno);
        System.out.println("The Name is" + obj1.name);
       
    }
    
}
