package student;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 25-Nov-20.
 */
public class StudentMain {
    public static void main(String[] args) {

        MarksClass[] studentData = new MarksClass[100];

        for (MarksClass studentRecord : studentData) {
            studentRecord.setChamistryMarks(getRandomNumber(30, 100));
            studentRecord.setBiologyMarks(getRandomNumber(30, 100));
            studentRecord.setEnglishMarks(getRandomNumber(30, 100));
            studentRecord.setUrduMarks(getRandomNumber(30, 100));
            studentRecord.setMathMarks(getRandomNumber(30, 100));
            studentRecord.setPhysicsMarks(getRandomNumber(30, 100));
        }


        for (int i = 0; i < studentData.length; i++) {
            System.out.println("Student " + studentData[i + 1] + " Details");
            System.out.println("--------------------------------------");
            System.out.println("Chemistry   " + studentData[i].getChemistryMarks());
            System.out.println("Biology     " + studentData[i].getBiologyMarks());
            System.out.println("English     " + studentData[i].setEnglishMarks());
            System.out.println("Urdu        " + studentData[i].getUrduMarks());
            System.out.println("Mathematics " + studentData[i].getMathMarks());
            System.out.println("Physics     " + studentData[i].getPhysicsMarks());
            System.out.println("--------------------------------------");
            System.out.println("OBTAINED MARKS  " + studentData[i].getObtainedMarks());
            System.out.println("PERCENTAGE OF MARKS " + studentData[i].getPersontage());
            System.out.println("======================================");
        }

    }

    public static int getRandomNumber(int lowerLimit, int upperLimit) {
        return ThreadLocalRandom.current().nextInt(lowerLimit, upperLimit);
    }


}
