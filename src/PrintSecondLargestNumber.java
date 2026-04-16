import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSecondLargestNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10, 9);

        Optional<Integer> sLargest = numbers.stream()
                .sorted((n1, n2) -> n2 - n1)
                .skip(1)
                .findFirst();

        System.out.println("Second largest Element Is:" + (sLargest.isPresent() ? sLargest.get() : "N/A"));

    }
}
