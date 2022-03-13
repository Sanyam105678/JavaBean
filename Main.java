package com.company;

import java.util.Scanner;import java.util.Scanner;
class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name of student:");

        String name = sc.next();
        System.out.println("Enter a roll number:");
        int roll= Integer.parseInt(sc.next());
        System.out.println("Enter marks:");
        int marks = Integer.parseInt(sc.next());
        JavaBean obj=new JavaBean(roll,marks,name);

        System.out.println(obj.getRollNumber());
        System.out.println(obj.getStudentName());
        System.out.println(obj.getMarks());
    }
}