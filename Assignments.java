import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        

        System.out.println("The addition of the two numbers is: " + (num +num2));
        System.out.println("The subtraction of the two numbers is: " + (num - num2));
        System.out.println("The multiplication of the two numbers is: " + (num * num2));
        System.out.println("The division of the two numbers is: " + (num / num2));

        if (num2 != 0) {
            System.out.println("The remainder of the division of the two numbers is: " + ((double)num / num2 ));
        } else {
            System.out.println("Error: Division by zero is not allowed!");
        }
        scanner.close();*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        scanner.close();

    }
    
}
