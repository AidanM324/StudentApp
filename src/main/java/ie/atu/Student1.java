package ie.atu;


import java.util.Scanner;
public class Student1 {

    private String name;
    private String userEmail;
    private String userCourse;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getUserEmail() {

        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCourse() {

        return userCourse;
    }

    public void setUserCourse(String userCourse) {

        this.userCourse = userCourse;
    }
    public void getUserdetails1(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Student E-mail: ");
        this.userEmail = scanner.nextLine();

        System.out.println("Enter Course studying: ");
        this.userCourse = scanner.nextLine();
    }

    public void displayInfo1(){
        System.out.println("Name: " + name + ", Email: " + userEmail + ", Course enrolled: " + userCourse);
    }

}
