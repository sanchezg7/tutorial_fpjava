import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = getSum(integers);

        System.out.println(sum);
    }

    private static int sum(int a, int b) {
        return a + b;
    }
    private static int getSum(List<Integer> numbers) {
        return numbers.stream()
                // aggregate all values into one
                .reduce(0, // initial value
                        Reduce::sum);
    }

    private static int getSumIterative(List<Integer> numbers) {
        int sum = 0;
        for( int num : numbers ) {
            sum += num;
        }
        return sum;
    }
}