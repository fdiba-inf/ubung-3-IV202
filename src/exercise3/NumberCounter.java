package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double sum = 0;

        while (number != 0) {
          if (number > 0) {
            positiveNumbers++;
          } else {
            negativeNumbers++;
          }

          sum = sum + number;

          System.out.println("Enter a number: ");
          number = input.nextInt();
        }

        double average = sum / (positiveNumbers + negativeNumbers);

        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
  }
        
           
           



        

