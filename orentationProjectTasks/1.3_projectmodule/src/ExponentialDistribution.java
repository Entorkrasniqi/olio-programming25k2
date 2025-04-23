import java.util.Random;

public class ExponentialDistribution {
    private final Random random;
    private final double rate;
// lampda rate
    public ExponentialDistribution(double rate) {
        this.random = new Random();
        this.rate = rate;
    }

    public double nextInterval() {
        return -Math.log(1 - random.nextDouble()) / rate;
    }
}