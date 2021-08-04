/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author London
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int i = 0, id = 1, id2;
        List<subject> subject_variable = new ArrayList<>();
        List<teacher> teacher_variable = new ArrayList<>();
        List<students> student_variable = new ArrayList<>();

        do {
            System.out.println("Teacher teacher teacher");
            System.out.println("1.Add Teacher");
            System.out.println("2.Show Teacher");
            System.out.println("3.Add Student");
            System.out.println("4.Show Student");
            System.out.println("5.Add Subject");
            System.out.println("6.Show Subject");
            i = scan.nextInt();
            switch (i) {
                case 1:
                    teacher tempteacher = new teacher();
                    teacher_variable.add(tempteacher.addteacher(scan, teacher_variable.size() + 1));
                    break;
                case 2:
                    for (teacher tempteacher2 : teacher_variable) {
                        tempteacher2.showteacher(tempteacher2);
                        for (students s : tempteacher2.student_variable) {
                            s.showstudent(s);
                        }
                    }
                    break;
                case 3:
                    System.out.println("*Add students for teachers id*");
                    id = scan.nextInt();
                    students tempstudent = new students();
                    teacher_variable.get(id - 1).student_variable
                            .add(tempstudent.addstudent(scan, teacher_variable.get(id - 1).student_variable.size() + 1));
                    break;
                case 4:
                    for (students tempstudent2 : student_variable) {
                        tempstudent2.showstudent(tempstudent2);
                    }
                    break;
                case 5:
                    System.out.println("*Add subject for students id*");
                    id2 = scan.nextInt();
                    subject tempsubject = new subject();
                    student_variable = teacher_variable.get(id - 1).student_variable;
                    student_variable
                    .get(id2 - 1).subject_variable.add(tempsubject.addsubject(scan));

                    break;
                case 6:
                    for (subject tempsubject2 : subject_variable) {
                        tempsubject2.showsubject(tempsubject2);
                    }
                    break;

            }
        } while (i != 0);
    }

}
