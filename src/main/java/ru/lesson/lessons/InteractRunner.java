package main.java.ru.lesson.lessons;

import java.util.Scanner;

public class InteractRunner {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    try {
      Calculator calculator = new Calculator();
      String exit = "no";
      while (!exit.equals("yes")) {
        System.out.println("Enter first arg: ");
        String first = reader.next();
        System.out.println("Enter second arg: ");
        String second = reader.next();
        calculator.add(Integer.valueOf(first), Integer.valueOf(second));
        System.out.println("Result: " + calculator.getResult());
        calculator.cleanResult();
        System.out.println("Exit: yes/no");
        exit = reader.next();
      }
    } finally {
      reader.close();
    }
  }
}
