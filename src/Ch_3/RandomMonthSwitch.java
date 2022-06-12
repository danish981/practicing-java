package Ch_3;

import java.util.Scanner;

public class RandomMonthSwitch {
    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("lower limit : ");
        int lowerLimit = input.nextInt();

        System.out.println("upper limit : ");
        int upperLimit = input.nextInt();

        if (lowerLimit > upperLimit) {
            int temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
        }

        int randomNumber = (int) (Math.random() * upperLimit) + lowerLimit;


        switch (randomNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.printf("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Undefined");
        }


    }


}
