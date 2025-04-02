import java.util.Scanner;// import scanner

public class User {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// create scanner object

        System.out.println("Enter your name:");
        String name = scanner.nextLine();// Read a String input

        System.out.println("Enter your age; ");
        int age = scanner.nextInt(); // read an int

        System.out.println("Hello, " + name + "! you are " + age + " years old.");
        scanner.close();
    }


    
}
