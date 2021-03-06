import java.util.Scanner;

public class cal {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter the values numbers:");

    double first = reader.nextDouble();
    double second = reader.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = reader.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = first + second;
        break;

      case '-':
        result = first - second;
        break;

      case '*':
        result = first * second;
        break;

      case '/':
        result = first / second;
        break;

      default:
        System.out.printf("Error!");
        return;
    }

    System.out.println(first + " " + operator + " " + second + " = " + result);
  }
}
