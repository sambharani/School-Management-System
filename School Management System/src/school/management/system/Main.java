package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Teacher bharani = new Teacher(1,"Bharani",500);
        Teacher aishu = new Teacher(2,"Aishu",700);
        Teacher preethi = new Teacher(3,"Preethi",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(bharani);
        teacherList.add(aishu);
        teacherList.add(preethi);

        Student rakesh = new Student(1,"Rakesh",4);
        Student sidhu = new Student(2,"Sidhu",12);
        Student manonmani = new Student(3,"Manonmani",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(rakesh);
        studentList.add(sidhu);
        studentList.add(manonmani);

        School akt = new School(teacherList, studentList);

        rakesh.payFees(5000);
        manonmani.payFees(6000);

        System.out.println("Making Pay Slip");
        bharani.receiveSalary(bharani.getSalary());
        System.out.println("AKT has spent for salary to" + bharani.getName() + "and now has " + akt.getTotalMoneyEarned());

        aishu.receiveSalary(aishu.getSalary());
        System.out.println("AKT has spent for salary to" + aishu.getName() + "and now has " + akt.getTotalMoneyEarned());

        System.out.println(bharani);
        System.out.println(rakesh);
    }
}
