package se.lexicon_osama;

import javax.swing.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hallo");
        System.out.println("Osama");

        Scanner input = new Scanner(System.in);
        int days;
        System.out.println("Enter how many days of the year: ");
        days = input.nextInt();
        if (days == 366) {
            System.out.println("It is a leap year.");


        } else
            System.out.println("It is not a leap year.");


        int x = 45;
        int y = 11;
        int v = x + y;
        System.out.println(v);

        int r = 12;
        int e = 4;
        int w = r * e;
        System.out.println(w);

        int q = 24;
        int t = 6;
        int u = q / t;
        System.out.println(u);

        int z = 55;
        int b = 12;
        int m = z - b;
        System.out.println(m);


        int s = 23;
        int i = 11;
        int o = 77;
        int average = (s + i + o) / 3;
        System.out.println(average);


        {
            Scanner name1 = new Scanner(System.in);
            String name;
            System.out.println("What is your name?");
            name = input.next();
            System.out.println("Hallo " + name);

            Scanner number1 = new Scanner(System.in);
            Scanner number2 = new Scanner(System.in);
            System.out.println("Enter first number:");

            int firstNumber;
            int secondNumber;
            firstNumber = input.nextInt();
            System.out.println("Enter second number:");
            secondNumber = input.nextInt();
            System.out.println(firstNumber + secondNumber);
            System.out.println(firstNumber * secondNumber);
            System.out.println(firstNumber - secondNumber);
            System.out.println(firstNumber / secondNumber);
        }
        {
            System.out.println("please input seconds:");
            int seconds = input.nextInt();
            int sec1 = seconds % 60;
            int sec2 = seconds / 60;
            int sec3 = sec2 % 60;
            sec2 = sec2 / 60;
            System.out.println(sec2 + ":" + sec3 + ":" + sec1);
        }
        Scanner reader = new Scanner(System.in);
        int guess, rand;
        rand = (int) (Math.random() * 500);
        boolean stillguess = true;
        while (stillguess) {
            System.out.println("Guess a number between 0 and 500");
            guess = reader.nextInt();
            if (guess > rand)
                System.out.println("Your guess was too big");
            else if (guess < rand)
                System.out.println("Your guess was too small");
            else {
                System.out.println("You win!");
                stillguess = false;
            }
        }
    }

    }





