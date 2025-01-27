package org.example;

import java.io.ObjectInputStream;
import java.util.Scanner;

public class App {
  public int getInput(int lower, int upper, String prompt, String error) {
    Scanner scanner = new Scanner(System.in);

    int inputNumber = 0;

    boolean repeat = true;
    while(repeat) {
      System.out.println(prompt);
      inputNumber = Integer.parseInt(scanner.nextLine());
      if(inputNumber > upper || inputNumber < lower) {
        System.out.println(error);
      } else {
        repeat = false;
      }
      System.out.println();
    }

    return inputNumber;
  }

  public static void main(String[] args) {
    App app = new App();
    System.out.println("Welcome to my input validation program!");
    int number = app.getInput(0, 100, "Input a number from [0, 100] inclusive: ", "Number is out of bounds");
    System.out.println("User has input the number: " + number);
    System.out.println();
    System.out.println("Exiting...");
  }
}
