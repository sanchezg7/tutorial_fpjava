import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumbersInListStructureItr(integers);
        printAllNumDeclarative(integers);

    }

    private static void printAllNumbersInListStructureItr(List<Integer> numbers) {
        // loop the numbers
        for(int num : numbers) {
            System.out.println(num);
        }
    }

    private static void printAllNumDeclarative(List<Integer> numbers) {
        numbers.stream() // turn into a sequence of numbers
                .forEach(Main::print); // method reference
    }

    private static void print(int number) {
        System.out.println(number);
    }
}