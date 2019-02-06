package cs245.Appler;

import java.util.Random;

public class Dice {//Dice Class
    private int numSides;
    private int face;
    private static Random roller = new Random();

    public Dice() {//Default constructor = 6 sided die
        numSides = 6;
        roll();
    }
    public Dice(int sides){//Other Constructor
        numSides = sides;
        if (sides < 1) {throw new IllegalArgumentException("side needs to be more than 1");}
        roll();
    }

    public int roll() {//Rolls the die and returns a number between 1 and the number of sides
        face = roller.nextInt(numSides) + 1;
        return face;
    }
}