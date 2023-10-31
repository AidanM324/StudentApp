package ie.atu;

import java.util.Scanner;

public class Student3 {
    private String name;
    private String userEmail;
    private String userCourse;

    public Student3(String name, String userEmail, String userCourse){
        this.name = name;
        this.userEmail = userEmail;
        this.userCourse = userCourse;
    }

    public Student3() {
        this.name = "";
        this.userEmail = "";
        this.userCourse = "";
    }

    public void getUserdetails3(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Student E-mail: ");
        this.userEmail = scanner.nextLine();

        System.out.println("Enter Course studying: ");
        this.userCourse = scanner.nextLine();
    }

    public void displayInfo3(){
        System.out.println("Name: " + name + ", Email: " + userEmail + ", Course enrolled: " + userCourse);
    }
}
