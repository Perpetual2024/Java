public class Index {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Number of arguments: " + args.length);



        if (args.length > 20) {
            System.out.println("Too many arguments!");
        } else {
            System.out.println("Argument is okay");
        }
    }
}

