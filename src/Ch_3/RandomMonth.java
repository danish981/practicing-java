package Ch_3;

import java.util.Scanner;

public class RandomMonth {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter lower limit ");
        int lowerLimit = input.nextInt();

        System.out.println("enter upper limit ");
        int upperLimit = input.nextInt();

        if (lowerLimit > upperLimit) {
            int temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
        }


        int randomNumber = (int) (Math.random() * upperLimit) + lowerLimit;

        if (randomNumber == 1) {
            System.out.println("January");
        } else if (randomNumber == 2) {
            System.out.println("February");
        } else if (randomNumber == 3) {
            System.out.println("March");
        } else if (randomNumber == 4) {
            System.out.println("April");
        } else if (randomNumber == 5) {
            System.out.println("May");
        } else if (randomNumber == 6) {
            System.out.println("June");
        } else if (randomNumber == 7) {
            System.out.println("July");
        } else if (randomNumber == 8) {
            System.out.println("August");
        } else if (randomNumber == 9) {
            System.out.println("September");
        } else if (randomNumber == 10) {
            System.out.println("October");
        } else if (randomNumber == 11) {
            System.out.println("November");
        } else if (randomNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println(randomNumber + " is beyond the limit.");
        }


    }


}
