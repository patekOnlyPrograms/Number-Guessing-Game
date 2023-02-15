package org.NumberGuess;
import java.util.Random;

public class RandomNumber {
    Random random = new Random();

    int upperBound = 20;

    int randNumber = 1 + random.nextInt(upperBound);

    public int getRandom() {
        return randNumber;
    }
}
