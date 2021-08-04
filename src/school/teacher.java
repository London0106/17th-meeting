/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.Scanner;
//name
//date birth

import java.util.ArrayList;
import java.util.List;

//salary
//assosiate = student

/**
 *
 * @author London
 */
public class teacher extends user{
   
    private String name;
    private int date_birth, salary, id;

    public List <students> student_variable = new ArrayList<>();
    public teacher() {
    super();
    }
    
    public String getname() {
        return name;
    }

    public int getdate_birth() {
        return date_birth;
    }

    public int getsalary() {
        return salary;
    }
    
    public int getid() {
        return id;
    }
    
    public void setname(String name) {
        this.name = name;
    }

    public void setdate_birth(int date_birth) {
        this.date_birth = date_birth;
    }

    public void salary(int salary) {
        this.salary = salary;
    }
    
    public void id(int id) {
        this.id = id;
    }
    
    public teacher addteacher(Scanner scan, int id){
    
        teacher teach = new teacher(); 
        teach.id(id);
        System.out.println("1.Teachers Name = ");
        teach.setname(scan.next());
        System.out.println("3.Teachers Date Birth = ");
        teach.setdate_birth(scan.nextInt());
        System.out.println("4.Teachers Salary = ");
        teach.salary(scan.nextInt());
        
        return teach;
    }
    
    public void showteacher(teacher teach){
        
        System.out.println("1.Teachers Name = "+teach.getname());
        System.out.println("2.Teachers Date Birth = "+teach.getdate_birth());
        System.out.println("3.Teachers Salary = "+teach.getsalary());
        
    }
}
