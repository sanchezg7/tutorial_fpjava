import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        Iterative.printAllNumbersInListStructureItr(integers);
//        Declarative.printAllNumDeclarative(integers);
//        Declarative.printEvenNumbers(integers);
        Declarative.printOddNumbersWithLambda(integers);

    }

    public static class Iterative {
        private static void printAllNumbersInListStructureItr(List<Integer> numbers) {
            // loop the numbers
            for (int num : numbers) {
                System.out.println(num);
            }
        }

        private static void printEvenNumbersInList(List<Integer> numbers) {
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
    }

    public static class Declarative {
        private static void print(int number) {
            System.out.println(number);
        }
        private static boolean isEven(int number) {
            return number % 2 == 0;
        }
        private static void printAllNumDeclarative(List<Integer> numbers) {
            numbers.stream() // turn into a sequence of numbers
                    .forEach(Declarative::print); // method reference
        }


        private static void printEvenNumbers(List<Integer> numbers) {
            numbers.stream()
                    .filter(Declarative::isEven)
                    .forEach(System.out::println);
        }

        private static void printOddNumbersWithLambda(List<Integer> numbers) {
            numbers.stream()
                    .filter(num -> num % 2 != 0)
                    .forEach(System.out::println);
        }
    }

}