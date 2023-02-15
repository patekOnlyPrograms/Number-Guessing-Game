package org.NumberGuess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomNumber rm = new RandomNumber();
        Scanner input = new Scanner(System.in);
        int randomNumber = rm.getRandom();
        //System.out.println("Your number is " + randomNumber);
        int triesCounter = 0;
        while (!(triesCounter == 3)){
            System.out.println("Please guess your number: " );
            int numberGuess = input.nextInt();
            if (numberGuess < randomNumber && triesCounter <= 3){
                System.out.println("Number too low");
                System.out.println("Please try again");
                triesCounter++;
            }
            if (numberGuess < randomNumber && triesCounter <= 3){
                System.out.println("Number too low");
                System.out.println("Please try again");
                triesCounter++;
            }
            else {
                System.out.println("Well Done");
                triesCounter = 3;
            }
        }
        System.out.println("Your random number was: " + randomNumber);
    }
}