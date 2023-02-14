import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a command:");

        // String input
        String command = myObj.nextLine();

        int result = 0;

        if (Objects.equals(command, "add")) {
            int num1 = myObj.nextInt();
            int num2 = myObj.nextInt();
            result = calc.add(num1, num2);
        }
        else if (Objects.equals(command, "subtract")) {
            int num1 = myObj.nextInt();
            int num2 = myObj.nextInt();
            result = calc.subtract(num1, num2);
        }
        else if (Objects.equals(command, "multiply")) {
            int num1 = myObj.nextInt();
            int num2 = myObj.nextInt();
            result = calc.multiply(num1, num2);
        }
        else if (Objects.equals(command, "divide")) {
            int num1 = myObj.nextInt();
            int num2 = myObj.nextInt();
            result = calc.divide(num1, num2);
        }
        else if (Objects.equals(command, "fibonacci")) {
            int num = myObj.nextInt();
            result = calc.fibonacciNumberFinder(num);
        }
        else if (Objects.equals(command, "binary")) {
            int num = myObj.nextInt();
            result = Integer.parseInt(calc.intToBinaryNumber(num));
        }

        // Output input by user
        System.out.println(result);
    }
}
