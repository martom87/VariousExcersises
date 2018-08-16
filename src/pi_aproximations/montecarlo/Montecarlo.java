package pi_aproximations.montecarlo;

import java.util.Random;
import java.util.Scanner;

public class Montecarlo {


    public static boolean isInside(double xPos, double yPos) {
        double distance = Math.sqrt((xPos * xPos) + (yPos * yPos));
        return (distance < 1.0);
    }

    public static double computePI(int numThrows) {
        Random randomGen = new Random(System.currentTimeMillis());
        int hits = 0;
        double PI = 0;
        for (int i = 1; i <= numThrows; i++) {
            double xPos = (randomGen.nextDouble()) * 2 - 1.0;
            double yPos = (randomGen.nextDouble()) * 2 - 1.0;
            if (isInside(xPos, yPos)) {
                hits++;
            }
        }
        PI = (4.0 * (hits / (double) numThrows));
        return PI;

    }

    public static void main(String[] args) {
        //set number of throws here
        int numThrows = 10;
        double PI = computePI(numThrows);
        double Difference = PI - Math.PI;// Print out the total results of our trials
        System.out.println("Number of throws = " + numThrows + ", Computed PI = " + PI + ", Difference = " + Difference);

    }

}
