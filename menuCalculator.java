import java.util.Arrays;
import java.util.Scanner;


public class menuCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter numbers");
            numbers[i] = input.nextInt();
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);



        int choice = 0;

        while (choice != 5) {
            System.out.println("MENU");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");

            choice = input.nextInt();

            if (choice == 1) {
                addNumbers(input);
            }
            else if (choice == 2) {
                subtractNumbers(input);
            }
            else if (choice == 3) {
                multiplyNumbers(input);
            }
            else if (choice == 4) {
                divideNumbers(input);
            }
            else if( choice ==5) {
                System.out.println("Goodbye");
            }
            else {
                System.out.println("Invalid choice");
            }

        }
        input.close();
    }
        public static void addNumbers(Scanner input) {
            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();
            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();
            double result = num1 + num2;
            System.out.println("Result: " + result);

        }

        public static void subtractNumbers(Scanner input) {
            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();
            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();
            double result = num1 - num2;
            System.out.println("Result: " + result);
        }

        public static void multiplyNumbers(Scanner input) {
            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();
            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();
            double result = num1 * num2;
            System.out.println("Result: " + result);
        }
        public static void divideNumbers(Scanner input) {
            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();
            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();
            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");

            } else {
                double result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }

    }
