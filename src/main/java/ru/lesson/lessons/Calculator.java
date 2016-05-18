package main.java.ru.lesson.lessons;

public class Calculator {
  private int result;

  public void add(int ... params) {
    for (Integer param : params) {
      this.result += param;
    }
  }

  public void deduct(int param1, int param2) {
    this.result = param1 - param2;
  }

  public void multiply(int ... params) {
    if (params.length > 0) {
      this.result = 1;
    }
    for (int param : params) {
      this.result *= param;
    }
  }

  public void divide(int param1, int param2) {
    if (param2 <= 0) {
      result = param1/param2;
    }
  }

  public int getResult() {
    return this.result;
  }

  public void cleanResult() {
    this.result = 0;
  }
}
