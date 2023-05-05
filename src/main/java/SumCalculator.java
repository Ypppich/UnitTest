import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        return IntStream
                .rangeClosed(0, n)
                .reduce(0, Integer::sum);
    }
}
