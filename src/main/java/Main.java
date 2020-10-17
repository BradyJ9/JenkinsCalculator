import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();

        boolean keepGoing = true;
        while (keepGoing) {

            System.out.println("Welcome To Calculator\n");

            System.out.println("Select Operation");
            System.out.println("1- Add");
            System.out.println("2- Subtract");
            System.out.println("3- Multiply");
            System.out.println("4- Divide");
            System.out.println("5- Fibonacci Number Finder");
            System.out.println("6- Integer To Binary");

            int operation = scan.nextInt();

            int first;
            int second;
            switch (operation) {
                case 1:
                    System.out.println("ADD\nWhat numbers would you like to add?");
                    first = scan.nextInt();
                    second = scan.nextInt();
                    System.out.println("ANSWER: " + calc.add(first, second) + "\n");
                    break;

                case 2:
                    System.out.println("SUBTRACT\nWhat numbers would you like to subtract?");
                    first = scan.nextInt();
                    second = scan.nextInt();
                    System.out.println("ANSWER: " + calc.subtract(first, second) + "\n");
                    break;

                case 3:
                    System.out.println("MULT\nWhat numbers would you like to multiply?");
                    first = scan.nextInt();
                    second = scan.nextInt();
                    System.out.println("ANSWER: " + calc.multiply(first, second) + "\n");
                    break;

                case 4:
                    System.out.println("DIV\nWhat numbers would you like to divide?");
                    first = scan.nextInt();
                    second = scan.nextInt();
                    System.out.println("ANSWER: " + calc.divide(first, second) + "\n");
                    break;

                case 5:
                    System.out.println("FIB\nWhat number would you like to fibonacci?");
                    first = scan.nextInt();
                    System.out.println("ANSWER: " + calc.fibonacciNumberFinder(first) + "\n");
                    break;

                case 6:
                    System.out.println("INT2B\nWhat number would you like to intToBinary?");
                    first = scan.nextInt();
                    System.out.println("ANSWER: " + calc.intToBinaryNumber(first) + "\n");
                    break;

                default:
                    System.out.println("ERROR");
            }

            System.out.println("Keep Going? Y/N");
            String cont = scan.next();
            if (cont.equals("N") || cont.equals("n")) {
                keepGoing = false;
            }
        }
        System.out.println("QUITTING");
    }

}
