public class Arrays {
    public static void main(String[] args) {
        //Declaring and initializing arrays
        int[] numbers = {1, 2, 3, 4, 5};//Array with predefined values
        //int [] number = new int [5];//An array with 5 elements

        System.out.println("First element: " + numbers[2]);
        //modifying array

        numbers[2]=98;
        System.out.println("First element: " + numbers[2]);

        //Looping through arrays
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " is " + numbers[i]);
        }
        //simpler loop
        for(int num : numbers){
            System.out.println("Number: " + num);
        }

        //Multi-Dimensional Arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Element at (1,1): " + matrix[1][1]);

        //nested loops
        for(int i = 0; i < matrix.length; i++){ // Loop through rows
            for(int j = 0; j < matrix[i].length; j++){ // Loop through columns
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println(); // New line for each row
        }
           
    }
}
