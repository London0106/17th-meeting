/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
//name
//date birth
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//assosiate = subject

/**
 *
 * @author London
 */
public class students extends user{

    private String name;
    private int date_birth,id;

    public List <subject> subject_variable = new ArrayList<>();
    public students() {
    super();
    }

    public String getname() {
        return name;
    }

    public int getdate_birth() {
        return date_birth;
    }
    
    public int getid(){
        return id;
    }
    public void setname(String name) {
        this.name = name;
    }

    public void setdate_birth(int date_birth) {
        this.date_birth = date_birth;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    public students addstudent(Scanner scan, int id){
        students studen = new students();
        studen.setid(id);
        System.out.println("1.Students Name = ");
        studen.setname(scan.next());
        System.out.println("2.Students Date Birth = ");
        studen.setdate_birth(scan.nextInt());
        return studen;
    }
    public void showstudent(students studen){
        System.out.println("-----------------------------------------------");
        System.out.println("1.Students Name = "+studen.getname());
        System.out.println("2.Students Date Birth = "+studen.getdate_birth());
    }
    
}
