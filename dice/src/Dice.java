import java.util.Random;

public class Dice {

    private int bound, faceUp;

    // this will create an x-sided dice where x=bound
    public Dice(int bound) {
        this.bound = bound;
        faceUp = 0;
    }

    public void rollDice() {
        Random rand = new Random();
        faceUp = rand.nextInt(bound-1)+1;
    }

    public int getLastRoll() {
        return faceUp;
    }
}
