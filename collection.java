/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
import java.lang.reflect.Array;
import java.util.*;
public class collection {
    public static void main(String args[])
    {
     //  HashSet<String>Student = new HashSet();
       ArrayList<String>Student = new ArrayList();

Student.add("mohan");
Student.add("sohan");
Student.add("rohan");
Student.add("mohan");

System.out.println(Student);
System.out.println(Student.size());
boolean flag=Student.contains("mohan");
System.out.println(flag);
for (String i : Student) {
  System.out.println(i+" GPA");
}
    }
    
}
