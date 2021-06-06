/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Sachin Mishra
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        double usd = Math.round(100 * euros * rate);
        usd /= 100;

        System.out.println();
        System.out.printf("%.2f euros at an exchange rate of %f is %.2f usd", euros, rate, usd);

    }
}
