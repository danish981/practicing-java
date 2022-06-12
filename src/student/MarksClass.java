package student;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 25-Nov-20.
 */
public class MarksClass {

    private int chemistry;
    private int biology;
    private int math;
    private int physics;
    private int english;
    private int urdu;

    public MarksClass() {
        chemistry = ThreadLocalRandom.current().nextInt(60, 100);
        biology = ThreadLocalRandom.current().nextInt(60, 100);
        math = ThreadLocalRandom.current().nextInt(60, 100);
        physics = ThreadLocalRandom.current().nextInt(60, 100);
        english = ThreadLocalRandom.current().nextInt(60, 100);
        urdu = ThreadLocalRandom.current().nextInt(60, 100);
    }


    public MarksClass(int chemistry, int biology, int math, int physics, int english, int urdu) {
        this.chemistry = chemistry;
        this.biology = biology;
        this.math = math;
        this.physics = physics;
        this.english = english;
        this.urdu = urdu;
    }

    public int getChemistryMarks() {
        return chemistry;
    }

    public void setChamistryMarks(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiologyMarks() {
        return biology;
    }

    public void setBiologyMarks(int biology) {
        this.biology = biology;
    }

    public int getMathMarks() {
        return math;
    }

    public void setMathMarks(int math) {
        this.math = math;
    }

    public int getPhysicsMarks() {
        return physics;
    }

    public void setPhysicsMarks(int physics) {
        this.physics = physics;
    }

    public int setEnglishMarks() {
        return english;
    }

    public void setEnglishMarks(int english) {
        this.english = english;
    }

    public int getUrduMarks() {
        return urdu;
    }

    public void setUrduMarks(int urdu) {
        this.urdu = urdu;
    }

    public int getObtainedMarks() {
        return this.biology + this.urdu + this.english + this.physics + this.math + this.chemistry;
    }

    public float getPersontage() {
        return ((float) getObtainedMarks() / (float) 600) * (float) 100;
    }





}
