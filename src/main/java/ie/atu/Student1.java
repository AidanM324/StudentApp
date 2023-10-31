package ie.atu;


import java.util.Scanner;
public class Student1 {

    private String name;
    private String userEmail;
    private String userCourse;

    public Student1(String name, String userEmail, String userCourse){
        this.name = name;
        this.userEmail = userEmail;
        this.userCourse = userCourse;
    }

    public Student1() {
        this.name = "";
        this.userEmail = "";
        this.userCourse = "";
    }

    public void getUserdetails(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Student E-mail: ");
        this.userEmail = scanner.nextLine();

        System.out.println("Enter Course studying: ");
        this.userCourse = scanner.nextLine();
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Email: " + userEmail + ", Course enrolled: " + userCourse);
    }
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
}
