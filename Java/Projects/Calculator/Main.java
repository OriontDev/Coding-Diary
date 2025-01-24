import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat = 'b';

        do{

            System.out.println("==========Very Epic Calculator==========");
            double a = 0;
            double b = 0;
            boolean SecondVariableSet = false;
            boolean FirstVariableSet = false;
            boolean ErrorFlag = false;
            


            do{
                try {
                    System.out.print("Enter first number : ");
                    a = scanner.nextDouble();
                    FirstVariableSet = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number!");
                    scanner.next(); //clear invalid input
                }
            }while(FirstVariableSet == false);
            
            System.out.print("Choose Operation (+-*/) : ");
            char operator = scanner.next().charAt(0);
            do{
                try {
                    System.out.print("Enter second number : ");
                    b = scanner.nextDouble();
                    SecondVariableSet = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number!");
                    scanner.next(); //clear invalid input
                }
            }while(SecondVariableSet == false);

            Operation operation = null;

            switch(operator){
                case '+':
                    operation = new Addition();
                    break;
                case '-':
                    operation = new Subtraction();
                    break;
                case '*':
                    operation = new Multiplication();
                    break;
                case '/':
                    operation = new Division();
                    break;
                default:
                    System.out.println("Invalid Operation!");
                    ErrorFlag = true;
            }

            if(operation != null && ErrorFlag == false){
                double result = operation.calculate(a, b);
                System.out.printf("Result: %.2f\n", result);
            }

            System.out.print("Do you want to repeat the calculator (y/n)? ");
            repeat = scanner.next().charAt(0);
        }while(repeat == 'Y' || repeat == 'y');

        System.out.println("Thank you for using calculator!");
        System.err.println("==========================================");


    }
}