package com.company;
/**
 * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 *
 * @author Reyhane
 * @version 0.0
 */
public class Student {
    private Course[] courses;
    //the student's first name
    private String firstName;
    //the student's last name
    private String lastName;
    //the student ID
    private String id;
    //the grade
    private int grade;
    private int currentSizeOfCourses = 0;

    /**
     * Create a new student with a given name and ID number.
     * @param fName  the first name of the student
     * @param lName the last name of the student
     * @param sID  the ID of the student
     */
    public Student(String fName , String lName , String sID ){
       firstName = fName ;
       lastName = lName ;
       id = sID;
       grade = 0 ;
       courses = new Course[20];
    }
    public void enrollCourse(Course course) {
        if (currentSizeOfCourses < 20) {
            //  System.out.println(String.valueOf(students.length));
            courses[currentSizeOfCourses] = course ;
            // System.out.println(String.valueOf(students.length));
            // System.out.println(currentSize);
            currentSizeOfCourses++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }


    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    public int getGrade() {
        return grade;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    /**
     * Print the student’s last name and ID number to the
     output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }

    /**
     * Set the grade of the student
     * @param grade the grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
