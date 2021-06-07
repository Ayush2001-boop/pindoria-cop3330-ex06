package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String first, sec;
        System.out.print("What is your current age? ");
        first = input.nextLine();
        System.out.print("At what age would you like to retire? ");
        sec = input.nextLine();
        int x = Integer.parseInt(first);
        int y = Integer.parseInt(sec);
        System.out.printf("You have %d years left until you can retire.%n", (y-x));
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("It's %d, so you can retire in %d.", year, (year+(y-x)));

    }//end main method
}//end classB