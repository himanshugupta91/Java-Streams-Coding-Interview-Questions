import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy5And3 {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 15);

        List<Integer> divisibleNumber = numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();

        System.out.println("Numbers divisible by 3 and 5 : " + divisibleNumber);

    }
}
