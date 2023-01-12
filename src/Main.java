import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printAllNumbersInListStructure(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printAllNumbersInListStructure(List<Integer> numbers) {
        // loop the numbers
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}