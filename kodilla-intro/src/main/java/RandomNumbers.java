import java.util.Random;

public class RandomNumbers {

    private Random random = new Random();
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public void trigger() {
        int sum = 0;
        int actual = 0;

        while (sum <= 5000) {
            actual = random.nextInt(31);
            if (actual < min) {
                min = actual;
            }
            if (actual > max) {
                max = actual;
            }
            sum = sum + actual;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
           int minNumber = randomNumbers.getMin();
           int maxNumber = randomNumbers.getMax();
        System.out.println("Minimum value" + " " + minNumber);
        System.out.println("Maximum value" + " " + maxNumber);

    }
}
