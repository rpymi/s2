package com.company;

public class Run {



        public static void main(String[] args) {
            Lab lab1 = new Lab(5 , "Sun");

           Student s1 = new Student("Reyhaneh","Payami","9628021");

             s1.setGrade(12);
             //s2.setGrade(13);
             //s3.setGrade(15);
             //s4.setGrade(18);
            //lab1.enrollStudent(s1);
            //lab1.enrollStudent(s2);
            //lab1.enrollStudent(s3);
            //lab1.enrollStudent(s4);
            //lab1.print();
            //lab1.calculateAvg();
            Course course1 = new Course("AP" , "Dr Zeinali" , "Sunday" , 10);
            Course course2 = new Course("TechnicalEnglish" , "Dr Fathi" , "Monday" , 12);
            s1.enrollCourse(course1);
        }
    }

