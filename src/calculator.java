import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        Double number1, number2, resu;
        while (true) {
            System.out.println("Choose an operator: +, -, *, or /");
            operator = sc.next().charAt(0);
            System.out.println("type first number");
            number1 = sc.nextDouble();
            System.out.println("type second number");
            number2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    resu = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + resu);
                    break;

                case '-':
                    resu = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + resu);
                    break;
                case '*':
                    resu = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + resu);
                    break;
                case '/':
                    try {
                        resu = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + resu);
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("cant divide by zero");
                        break;
                    }
            }

        }
    }
}
