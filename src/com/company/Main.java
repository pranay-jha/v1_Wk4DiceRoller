package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean cont = true;

        while(cont == true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of dice and sides on each die in XdY format: ");
            String input = s.nextLine();
            String[] stuff = input.split("d", 2);
            int numberOfDice = Integer.parseInt(stuff[0]);
            int numberOfSides = Integer.parseInt(stuff[1]);

            int[] dice = new int[numberOfDice];

            for(int i = 0; i < dice.length; i++) {
                Random rand = new Random();
                dice[i] = rand.nextInt(numberOfSides) + 1;
            }

            int total = 0;
            String msg = "";
            for(int die: dice) {
                msg = "You rolled a " + die + " on a " + numberOfSides + " sided die\n";
                System.out.println(msg);
                total += die;
            }

            System.out.println("Your total is " + total);

            String again = "";
            System.out.println("Would you like to continue rolling? Y/N: ");
            again = s.nextLine();
            if (again.equals("N")) {
                cont = false;
                System.out.println("Thanks for playing!");
            }
        }

    }
}
