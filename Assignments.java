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
        scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        scanner.close();*/

    Scanner scanner = new Scanner(System.in) ; 
    
    int[][] matrix = new int[2][3];
    System.out.println("Enter nine number for the 3x3 matrix");
    for (int i=0; i<2; i++){
        for(int j=0; j<3; j++){
            matrix[i][j] = scanner.nextInt();
        }
    }
    System.out.println("\nThe 3x3 Matrix is:");
    for (int i=0; i<2; i++){
        for(int j=0; j<3; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    scanner.close();


    }
    
}
