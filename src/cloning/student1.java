/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloning;

/**
 *
 * @author hilbe
 */
public class student1 implements Cloneable {
 int rollno;
 String name;
 student1()///default constructor
 {
   rollno=5011;
   name="GAVASKAR";
 }
 student1(int rollno1,String name1)///argumented constructuror
 {
     rollno=rollno1;
     name=name1;
 }
 public Object clone() throws CloneNotSupportedException
{
   return super.clone();
}
}
