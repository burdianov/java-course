package main.java.ru.lesson.lessons;

public class Calculate {
  static int calculate(int first, int second, String action) {
    int result = 0;
    switch (action) {
      case "addition":
        result = first + second;
        break;
      case "subtraction":
        result = first - second;
        break;
      case "multiplication":
        result = first * second;
        break;
      case "division":
        result = first / second;
        break;
      default:
        result = 0;
        break;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("calculator.Calculate...");

    int first = Integer.valueOf(args[0]);
    int second = Integer.valueOf(args[1]);
    System.out.println("Add:\t\t " + calculate(first, second, "addition"));
    System.out.println("Deduct:\t " + calculate(first, second, "subtraction"));
    System.out.println("Multiply: " + calculate(first, second, "multiplication"));
    System.out.println("Divide:\t " + calculate(first, second, "division"));
  }
}
