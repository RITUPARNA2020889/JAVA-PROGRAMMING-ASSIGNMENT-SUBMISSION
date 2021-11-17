***Sum of two integer numbers using command line arguments in java***


public class CommandLineArguments {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
}


***Sum of two double numbers using command line arguments in java***


public class CommandLineArguments1 {
 
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double sum = a + b;
        System.out.println("Sum is " + sum);
 
    }
}







