package racing;

import java.util.Random;

public class RandomGenerator {

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
