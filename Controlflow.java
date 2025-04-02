import java.util.Scanner;

public class Controlflow {
    public static void main(String[] args) {
        //if-else Statements smae as python if,else if,else
        //same as for loops for(i=0, i<= 5, i++){}
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }//This prints every number to five

        //while loop
        int j = 0;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;//adding plus j
        }//This will print every number to five

        //do while loops it ensures atleast one excecution
        
        int k = 1;
        do{
            System.out.println("Number: " + k);
            k++;
        }while (k<=5);
        //Switch operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = scanner.nextDouble();
        System.out.println("Enter second number");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operator: (+, -)");
        char operator = scanner.next().charAt(0);// charAt(0) is used to get the first character

        double result;
        switch (operator) {
            case '+':
            result = number + number2;
            System.out.println("Result: " + result);
            break;
            case '-':
            result = number - number2;
            System.out.println("Result: " + result);
            break;
            default:
            System.out.println("Invalid operator");
        }
        scanner.close();

    }
}

