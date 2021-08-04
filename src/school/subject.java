/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
//subjects name
//grade
import java.util.Scanner;
/**
 *
 * @author London
 */
public class subject {

    private String name;
    private int grade;

    public String getname() {
        return name;
    }

    public int getgrade() {
        return grade;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setgrade(int grade) {
        this.grade = grade;
    }
    public subject addsubject(Scanner scan){
        subject sub = new subject();
        System.out.println("1.Subject Name");
        sub.setname(scan.next());
        System.out.println("2.Subject Grade");
        sub.setgrade(scan.nextInt());
        
        return sub;
    }
    public void showsubject(subject sub){
        System.out.println("1.Subject Name = "+sub.getname());
        System.out.println("2.Subject Grade = "+sub.getgrade());
    }
}
