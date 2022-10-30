package HW2;

import java.util.Scanner;

public class Calculator {
    static int firstNumber;
    static int secondNumber;
    static Scanner myObj;
    static String operationSymbol;

    public static void main(String[] args) throws Exception {
        myObj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber = myObj.nextInt();
        System.out.println("Enter operation symbol(ex: *, /, -, +, %)");
        operationSymbol = myObj.next();
        System.out.println("Enter second number: ");
        secondNumber = myObj.nextInt();

        switch (operationSymbol) {
            case "*":
                System.out.println("Result of addition: " + multiply());
                break;
            case "/":
                System.out.println("Result of divide: " + divide());
                break;
            case "-":
                System.out.println("Result of subtract: " + subtract());
                break;
            case "+":
                System.out.println("Result of addition: " + addition());
                break;
            case "%":
                System.out.println("Result residual of divide : " + percentage());
                break;
            default:
                System.out.println("Error");
        }
    }

    private static int percentage() throws Exception {
        if (secondNumber == 0) {
            throw new Exception("Can't divide by zero");
        }
        return firstNumber / secondNumber * 100;
    }

    private static int addition() {
        return firstNumber + secondNumber;
    }

    private static int subtract() {
        return firstNumber - secondNumber;
    }

    private static int multiply() {
        return firstNumber * secondNumber;
    }

    private static double divide() throws Exception {
        if (secondNumber == 0) {
            throw new Exception("Can't divide by zero");
        }
        return (double) firstNumber / (double) secondNumber;
    }
}

