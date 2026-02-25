import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

public class ListOfIntegerContainsAPrimeNumber {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream()
                .filter(ListOfIntegerContainsAPrimeNumber::isPrime)
                .toList().forEach(System.out::println);

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        /*for(int i = 2 ; i <= Math.sqrt(number); i++ ) {
            if (number % i == 0) {
                return false;
            }
        }*/

        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}
