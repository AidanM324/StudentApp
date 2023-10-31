package ie.atu;


import java.util.Scanner;
public class Student2 {

    private String name;
    private String userEmail;
    private String userCourse;

    public Student2(String name, String userEmail, String userCourse){
        this.name = name;
        this.userEmail = userEmail;
        this.userCourse = userCourse;
    }

    public Student2() {
        this.name = "";
        this.userEmail = "";
        this.userCourse = "";
    }

    public void getUserdetails2(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Student E-mail: ");
        this.userEmail = scanner.nextLine();

        System.out.println("Enter Course studying: ");
        this.userCourse = scanner.nextLine();
    }

    public void displayInfo2(){
        System.out.println("Name: " + name + ", Email: " + userEmail + ", Course enrolled: " + userCourse);
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
}
