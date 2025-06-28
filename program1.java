import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    double calculate() {
        switch (operation) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                if (b != 0)
                    return a / b;
                else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid Operation");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); // Consume newline
        System.out.print("Enter operation (Addition, Subtraction, Multiplication, Division): ");
        String op = sc.nextLine();

        Calculator calc = new Calculator(a, b, op);
        double result = calc.calculate();

        System.out.println("Result: " + result);
    }
}
