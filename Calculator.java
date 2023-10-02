import java.util.Scanner;
import java.lang.Math;


import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Calculator {
    public static void main(String[] args) {
        //class object   constructor method
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        double result = 0.0;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, S= sine, C= cosine, R= square root, P= raised to the power of, L= Log- enter base first, N= Natural Log, T= Tangent enter degrees): ");
        operator = scanner.next().charAt(0);

        num2 = 0.0;
        if ( operator != 'S' && operator != 'C' && operator != 'R' && operator != 'N' && operator != 'T') {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        }


        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            //sine
            case 'P':
            {
                int pow = 1;
                for (int i = 1; i <= num2; i++)
                    pow *= num1;
                result = pow;
            }
            break;
            case 'T':
                num2 = Math.toRadians(num1);
                result = Math.tan(num2);
                break;
            case 'N':
                result = Math.log(num1);
                break;
            case 'L':
                result = Math.log(num2)/ Math.log(num1);
                break;
            case 'S':
                num2 = Math.toRadians(num1);
                result = sin(num2);
                break;
            //Cosine
            case 'R':
                num2 = Math.pow(num1, 0.5);
                result = (num2);
                break;
            case 'C':
                num2 = Math.toRadians(num1);
                result = cos(num2);
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
        System.out.println("Result: " + result);

        scanner.close();
    }
}
