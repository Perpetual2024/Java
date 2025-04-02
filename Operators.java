public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition; " + (a + b));
        System.out.println("Subtraction; " + (a - b));
        System.out.println("Multiplication; " + (a * b));
        System.out.println("Division; " + (a / b));
        System.out.println("Modulus; " + (a % b));

        //Relational Operators/Comparison
        int x = 10, y = 5;
        System.out.println("Equality; " + (x == y));
        System.out.println("Inequality; " + (x != y));
        System.out.println("Greater than; " + (x > y));
        System.out.println("Less than; " + (x < y));
        System.out.println("Greater than or equal to; " + (x >= y));
        System.out.println("Less than or equal to; " + (x <= y));

        //Logical Operators(&&,||,!)
        boolean p = true, q = false;
        System.out.println("Logical AND; " + (p && q));
        System.out.println("Logical OR; " + (p || q));
        System.out.println("Logical NOT; " + (!p));

        //Assignment Operators(=, +=,-=,*=,/=,%=)
        int c = 10;
        c += 5; // same as c = c + 5
        System.out.println("Addition Assignment; " + c);
    }
    
}

