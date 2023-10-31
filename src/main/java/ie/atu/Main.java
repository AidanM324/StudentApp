package ie.atu;



public class Main {
    public static void main(String[] args) {

        // instance of student using getters and setters to collect,
        // name, email and course studying

        Student1 user = new Student1();

        user.getUserdetails();


        user.displayInfo();

        // new instance of student, constructor used to collect name,
        // getters and setters to collect email and course.

        Student2 user2 = new Student2();

        user2.getUserdetails2();


        user2.displayInfo2();

    }
}